package com.Permanente.servingwebcontent.services;

import com.Permanente.servingwebcontent.clases.*;
import com.Permanente.servingwebcontent.repository.AntiguedadRepository;
import com.Permanente.servingwebcontent.repository.NominaRepository;
import com.Permanente.servingwebcontent.repository.SalarioBaseRepository;
import com.Permanente.servingwebcontent.repository.TrabajadorRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@Service
public class ReportService {


    public void exportToPdf(Report report) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Deism\\OneDrive\\Escritorio";
        List<Report> list = new ArrayList<Report>();
        list.add(report);
        //load file and compile
        File file = ResourceUtils.getFile("classpath:nomina.jrxml");

        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Java Techie");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\Nomina" + report.getNombre() + ".pdf");
    }
}
