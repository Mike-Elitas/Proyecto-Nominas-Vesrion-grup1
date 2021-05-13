package com.Permanente.servingwebcontent.services;

import com.Permanente.servingwebcontent.clases.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@Service
public class ReportService {
    //Metodo encargado de recoger el reporte actual y compilar el archivo .jrxml junto a los datos del reporte
    private JasperPrint compilar(Report report) throws FileNotFoundException, JRException {

        List<Report> list = new ArrayList<Report>();
        list.add(report);

        //Cargar archivo y compilar
        File file = ResourceUtils.getFile("classpath:nomina.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Ismael");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        return jasperPrint;
    }

    //Metodo encargado de exportar el reporte compilado a formato PDF
    public String exportToPdf(Report report) throws FileNotFoundException, JRException {
        //detectamos el sistema del usuario y decidimos la ruta a exprtar
        String sSistemaOperativo = System.getProperty("os.name");
        String a = System.getProperty("user.name");
        String path = "";

        if (sSistemaOperativo.equals("Linux")) {
            path = "/home/" + a;
        } else {
            path = "C:\\Users\\" + a;
        }

        JasperExportManager.exportReportToPdfFile(compilar(report), path + "\\Nomina" + report.getNombre() + ".pdf");
        return path;

    }

    //Metodo encargado de exportar el reporte compilado a formato XML
    public String exportToXml(Report report) throws JRException, IOException {
        //detectamos el sistema del usuario y decidimos la ruta a exprtar
        String sSistemaOperativo = System.getProperty("os.name");
        String a = System.getProperty("user.name");
        String path = "";

        if (sSistemaOperativo.equals("Linux")) {
            path = "/home/" + a;
        } else {
            path = "C:\\Users\\" + a;
        }

        JasperExportManager.exportReportToXmlFile(compilar(report), path + "\\Nomina" + report.getNombre() + ".xml", false);
        return path;
    }

    //Metodo encargado de exportar el reporte compilado a formato CSV
    public void exportToCsv(Report report, HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-disposition", "attachment; filename=Nomina" + report.getNombre() + ".csv");

        //Generamos el CSV siguiendo la clase report como modelo
        ICsvBeanWriter csvBeanWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
        String[] heading = {"nombre", "apellido", "dni_trabajador", "grupo", "salario", "liquido", "extras", "categoria", "id", "cc", "fp", "horasextrafurzamayor", "horasextranormales", "descuentocc", "descuento_desempleo"
                , "descuento_fp", "descuento_hextra_fueza_mayor", "descuento_hextra_normales", "descuento_irpf", "irpf", "prorata", "t_aportaciones", "t_deducciones", "t_devengos", "t_liquido"};
        String[] pojoclassPropertyName = {"nombre", "apellido", "dni_trabajador", "grupo", "salario", "liquido", "extras", "categoria", "id", "cc", "fp", "horasextrafurzamayor", "horasextranormales", "descuentocc", "descuento_desempleo"
                , "descuento_fp", "descuento_hextra_fueza_mayor", "descuento_hextra_normales", "descuento_irpf", "irpf", "prorata", "t_aportaciones", "t_deducciones", "t_devengos", "t_liquido"};
        csvBeanWriter.writeHeader(heading);
        csvBeanWriter.write(report, pojoclassPropertyName);
        csvBeanWriter.close();
    }

}
