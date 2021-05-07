package com.Permanente.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
    @Autowired
    TrabajadorRepository tRepository;
    @Autowired
    SalarioBaseRepository pRepository;

    @RequestMapping("/nomina")
    public String showInfo(Model model) {
        Dni dni = new Dni();
        model.addAttribute("dni", dni);
        return "nomina";
    }

    @PostMapping(value = "/nomina")
    public String captureData(@ModelAttribute("dni") Dni dni, Model model) {
        Trabajador t=tRepository.findByDni(dni.getDni());
        model.addAttribute("t", caclnomina(t));
        return "demo";
    }

    private int caclnomina(Trabajador t){
        SalarioBase p= pRepository.findAllById(t.getProfesion());
        int nomina=p.getSalario()+t.getExtras();
        return nomina;
    }

}
