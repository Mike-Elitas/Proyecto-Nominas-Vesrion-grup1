package com.Permanente.servingwebcontent;

import com.Permanente.servingwebcontent.clases.*;
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

import java.io.FileNotFoundException;

@Controller
public class MainController {
    @Autowired
    private TrabajadorRepository trabajadorRepository;
    @Autowired
    private NominaRepository nominaRepository;
    @Autowired
    private SalarioBaseRepository salarioBaseRepository;
    @Autowired
    private AntiguedadRepository antiguedadRepository;
    @Autowired
    private ReportService service;

    @GetMapping("/nomina")
    public String showInfo(Model model) {
        Dni dni = new Dni();
        model.addAttribute("dni", dni);
        return "nomina";
    }

    @PostMapping(value = "/nomina")
    public String captureData(@ModelAttribute("dni") Dni dni, Model model) {
        model.addAttribute("t", generarReporte(dni.getDni()));
        return "nomina2";
    }

    @PostMapping(value = "/nomina2")
    public String generarPdf(@ModelAttribute("t") Report report) throws JRException, FileNotFoundException {
        service.exportToPdf(report);
        return "reporteGenerado";
    }


    private Report generarReporte(String dni) {
        Report report = new Report();
        Trabajador trabajador = trabajadorRepository.findByDni(dni);
        Nomina nomina = nominaRepository.findByDniTrabajador(trabajador.getDni());
        SalarioBase salarioBase = salarioBaseRepository.findAllById(trabajador.getCategoria());
        Antiguedad antiguedad = antiguedadRepository.findById(trabajador.getAntigüedad());
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
        report.setIrpf(nomina.getIrpf());
        report.setLiquido(antiguedad.getLiquido());
        report.setSalario(salarioBase.getSalario());
        report.setCategoria(trabajador.getCategoria());
        report.setApellido(trabajador.getApellido());
        report.setDescuento_hextra_fueza_mayor(nomina.getDescuentoHextraFuezaMayor());
        report.setDescuento_hextra_normales(nomina.getDescuentoHextraNormales());
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
