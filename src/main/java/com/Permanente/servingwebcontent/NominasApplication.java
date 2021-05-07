package com.Permanente.servingwebcontent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NominasApplication {
    private static final Logger log = LoggerFactory.getLogger(NominasApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NominasApplication.class, args);
    }


    @Autowired
    SalarioBaseRepository salarioBaseRepository;
    @Autowired
    AntiguedadRepository antiguedadRepository;
    @Autowired
    CovenioRepository covenioRepository;

    @Bean
    public CommandLineRunner demo(TrabajadorRepository repository) {
        return (args) -> {
//            repository.save(new Trabajador("43231815A", "Ismael", "Martin", "01/04/1999", "H", 1, 1, 50, 2f, 6.35f));
//            repository.save(new Trabajador("43531817B", "Miki", "Cañellas", "15/05/2000", "H", 5, 2, 55, 20f, 6.35f));
//            repository.save(new Trabajador("43533815C", "Ivan", "sanchez", "17/06/2001", "H", 4, 3, 100, 10f, 6.35f));
//            repository.save(new Trabajador("43271865V", "Jaun", "Molinos", "20/05/1997", "H", 3, 4, 55, 15f, 6.35f));
//            repository.save(new Trabajador("44231715G", "Carlos", "Gonzalez", "17/08/2000", "H", 6, 1, 20, 20f, 6.35f));
//            repository.save(new Trabajador("47231315D", "Marian", "Alcaraz", "15/07/1998", "M", 2, 5, 15, 5f, 6.35f));
//            repository.save(new Trabajador("43431855S", "Maria", "Velazquez", "05/09/2000", "M", 1, 6, 0, 2f, 6.35f));
//            repository.save(new Trabajador("43241915L", "Marta", "Sequera", "10/10/1999", "M", 1, 2, 30, 50f, 6.35f));

//            salarioBaseRepository.save(new SalarioBase(1000, 2));
//            salarioBaseRepository.save(new SalarioBase(2000, 1));
//            salarioBaseRepository.save(new SalarioBase(3000, 3));
//            salarioBaseRepository.save(new SalarioBase(4000, 3));
//            salarioBaseRepository.save(new SalarioBase(5000, 2));
//            salarioBaseRepository.save(new SalarioBase(6000, 1));

//            antiguedadRepository.save(new Antiguedad(10, 1));
//            antiguedadRepository.save(new Antiguedad(20, 2));
//            antiguedadRepository.save(new Antiguedad(30, 1));
//            antiguedadRepository.save(new Antiguedad(40, 3));
//            antiguedadRepository.save(new Antiguedad(50, 2));
//            antiguedadRepository.save(new Antiguedad(60, 1));

//            covenioRepository.save(new Convenio("Hosteleria"));
//            covenioRepository.save(new Convenio("Industria"));
//            covenioRepository.save(new Convenio("Informatica"));

            Trabajador trabajador = repository.findByDni("43231815A");
            SalarioBase profesion = salarioBaseRepository.findAllById(trabajador.getProfesion());
            log.info("Trabajador encontrado " + trabajador.getNombre());
            log.info("===============================================");
            log.info("Profesion encontrado " + profesion.toString());
            log.info("===============================================");
        };
    }
}
