package com.Permanente.servingwebcontent;

import com.Permanente.servingwebcontent.clases.*;
import com.Permanente.servingwebcontent.interfaces.NominalService;
import com.Permanente.servingwebcontent.repository.AntiguedadRepository;
import com.Permanente.servingwebcontent.repository.NominaRepository;
import com.Permanente.servingwebcontent.repository.SalarioBaseRepository;
import com.Permanente.servingwebcontent.repository.TrabajadorRepository;
import com.Permanente.servingwebcontent.services.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private Report report;
    @Autowired
    NominaRepository nominaRepository;
    @Autowired
    TrabajadorRepository trabajadorRepository;
    @Autowired
    AntiguedadRepository antiguedadRepository;
    @Autowired
    SalarioBaseRepository salarioBaseRepository;
    @Autowired
    NominalService nominalService;
    @Autowired
    ReportService reportService;

    //Metodo encargado de mostrar la vista principal del programa
    @GetMapping("/nomina")
    public String nomina(Model model) {
        Dni dni = new Dni();
        //Generamos dos listas una de Dni's y otra de trabajadores
        List<String> dnis = new ArrayList<>();
        List<Trabajador> trabajadorList = (List<Trabajador>) trabajadorRepository.findAll();

        //Almacenamos los Dni de los trabajadores en la lista de dni's
        for (Trabajador t :
                trabajadorList) {
            dnis.add(t.getDni());
        }

        //Agregamos dos modelos para poder gestionarlos desde html
        model.addAttribute("dnis", dnis);
        model.addAttribute("dni", dni);

        return "nomina";
    }

    //Metodo encargado de recoger la solicitud de generar una nomina y retorna el reporte en formato html para ser visto
    @PostMapping("/nomina")
    public String generar(@ModelAttribute("dnis") Dni dni, Model model) {
        Nomina nomina = generarNomina(dni);
        report = generarReporte(nomina);
        model.addAttribute("t", report);
        return "nominaGenerada";
    }

    //Metodo en cargado de recoger la solicitud de exportar a PDF
    @PostMapping(value = "/nominaGenerada/pdf")
    public String generarPdf(Model model) throws JRException, FileNotFoundException {
        model.addAttribute("report", reportService.exportToPdf(report));
        return "reporteGenerado";
    }

    //Metodo en cargado de recoger la solicitud de exportar a XML
    @PostMapping(value = "/nominaGenerada/xml")
    public String generarXml(Model model) throws JRException, IOException {
        model.addAttribute("report", reportService.exportToXml(report));
        return "reporteGenerado";
    }

    //Metodo en cargado de recoger la solicitud de exportar a CSV
    @PostMapping(value = "/nominaGenerada/csv")
    public String generarCsv(HttpServletResponse response) throws IOException {
        reportService.exportToCsv(report, response);
        return "reporteGenerado";
    }

    //Metodo encargado de generar una nomina e insertarla en la base de datos
    private Nomina generarNomina(Dni dni) {
        Trabajador trabajador = trabajadorRepository.findByDni(dni.getDni());
        String dniTrabajador = trabajador.getDni();
        float devengos = nominalService.devengos(trabajador);
        float prorata = nominalService.prorata(trabajador);
        float cc = nominalService.descuentoCC(trabajador);
        float desempleo = nominalService.descuentoDesempleo(trabajador);
        float fp = nominalService.descuentoFp(trabajador);
        float aportaciones = nominalService.aportaciones(trabajador);
        float irpf = nominalService.descuentoirpf(trabajador);
        float deducciones = nominalService.deducciones(trabajador);
        float neto = nominalService.neto(trabajador);
        Nomina nomina = new Nomina(dniTrabajador, devengos, deducciones, aportaciones, neto, prorata, cc, desempleo, fp, irpf, "A");
        nominaRepository.save(nomina);
        return nomina;
    }

    //Metodo encargado de generar un reporte para mostrar al usuario
    private Report generarReporte(Nomina nomina) {
        Report report = new Report();
        Trabajador trabajador = trabajadorRepository.findByDni(nomina.getDniTrabajador());
        Antiguedad antiguedad = antiguedadRepository.findById(trabajador.getAntiguedad());
        SalarioBase salarioBase = salarioBaseRepository.findById(trabajador.getCategoria());
        report.setNombre(trabajador.getNombre());
        report.setApellido(trabajador.getApellido());
        report.setCategoria(trabajador.getCategoria());
        report.setCc(nomina.getCC());
        report.setDescuento_desempleo(nomina.getDescuentoDesempleo());
        report.setDescuento_fp(nomina.getDescuentoFp());
        report.setDescuentocc(nomina.getDescuentoCC());
        report.setDesempleo(nomina.getDESEMPLEO());
        report.setExtras(trabajador.getExtras());
        report.setId(nomina.getId());
        report.setIrpf(trabajador.getIrpf());
        report.setLiquido(antiguedad.getLiquido());
        report.setSalario(salarioBase.getSalario());
        report.setCategoria(trabajador.getCategoria());
        report.setApellido(trabajador.getApellido());
        report.setDni_trabajador(trabajador.getDni());
        report.setGrupo(nomina.getGrupo());
        report.setFp(nomina.getFP());
        report.setHorasextrafurzamayor(nomina.getHORASEXTRAFURZAMAYOR());
        report.setHorasextranormales(nomina.getHORASEXTRANORMALES());
        report.setDescuento_irpf(nomina.getDescuentoIrpf());
        report.setProrata(nomina.getProrata());
        report.setT_aportaciones(nomina.gettAportaciones());
        report.setT_deducciones(nomina.gettDeducciones());
        report.setT_devengos(nomina.gettDevengos());
        report.setT_liquido(nomina.gettLiquido());
        return report;
    }


}
