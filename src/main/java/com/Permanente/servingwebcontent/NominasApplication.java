package com.Permanente.servingwebcontent;

import com.Permanente.servingwebcontent.clases.*;
import com.Permanente.servingwebcontent.repository.*;
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
/**Pruebas e inserts a la Base de datos.*/
    @Autowired
    SalarioBaseRepository salarioBaseRepository;
    @Autowired
    AntiguedadRepository antiguedadRepository;
    @Autowired
    CovenioRepository covenioRepository;
    @Autowired
    NominaRepository nominaRepository;

    @Bean
    public CommandLineRunner demo(TrabajadorRepository repository) {

        return (args) -> {
//            repository.save(new Trabajador("43231815A", "Ismael", "Martin", "01/04/1999", "H", 1, 1, 50, 15));
//            repository.save(new Trabajador("43531817B", "Miki", "Cañellas", "15/05/2000", "H", 5, 2, 55, 20));
//            repository.save(new Trabajador("43533815C", "Ivan", "sanchez", "17/06/2001", "H", 4, 3, 100, 2));
//            repository.save(new Trabajador("43271865V", "Jaun", "Molinos", "20/05/1997", "H", 3, 4, 55, 10));
//            repository.save(new Trabajador("44231715G", "Carlos", "Gonzalez", "17/08/2000", "H", 6, 1, 20, 8));
//            repository.save(new Trabajador("47231315D", "Marian", "Alcaraz", "15/07/1998", "M", 2, 5, 15, 18));
//            repository.save(new Trabajador("43431855S", "Maria", "Velazquez", "05/09/2000", "M", 1, 6, 0, 25));
//            repository.save(new Trabajador("43241915L", "Marta", "Sequera", "10/10/1999", "M", 1, 2, 30, 50));

//            salarioBaseRepository.save(new SalarioBase(1000, 1));
//            salarioBaseRepository.save(new SalarioBase(2000, 1));
//            salarioBaseRepository.save(new SalarioBase(3000, 1));
//            salarioBaseRepository.save(new SalarioBase(4000, 1));
//            salarioBaseRepository.save(new SalarioBase(5000, 1));
//            salarioBaseRepository.save(new SalarioBase(6000, 1));
//
//            salarioBaseRepository.save(new SalarioBase(1100, 2));
//            salarioBaseRepository.save(new SalarioBase(2100, 2));
//            salarioBaseRepository.save(new SalarioBase(3100, 2));
//            salarioBaseRepository.save(new SalarioBase(4100, 2));
//            salarioBaseRepository.save(new SalarioBase(5100, 2));
//            salarioBaseRepository.save(new SalarioBase(6200, 2));
//
//            salarioBaseRepository.save(new SalarioBase(1200, 3));
//            salarioBaseRepository.save(new SalarioBase(2200, 3));
//            salarioBaseRepository.save(new SalarioBase(3200, 3));
//            salarioBaseRepository.save(new SalarioBase(4200, 3));
//            salarioBaseRepository.save(new SalarioBase(5200, 3));
//            salarioBaseRepository.save(new SalarioBase(6200, 3));

//            antiguedadRepository.save(new Antiguedad(10, 1));
//            antiguedadRepository.save(new Antiguedad(20, 1));
//            antiguedadRepository.save(new Antiguedad(30, 1));
//            antiguedadRepository.save(new Antiguedad(40, 1));
//            antiguedadRepository.save(new Antiguedad(50, 1));
//            antiguedadRepository.save(new Antiguedad(60, 1));
//
//            antiguedadRepository.save(new Antiguedad(11, 2));
//            antiguedadRepository.save(new Antiguedad(21, 2));
//            antiguedadRepository.save(new Antiguedad(31, 2));
//            antiguedadRepository.save(new Antiguedad(41, 2));
//            antiguedadRepository.save(new Antiguedad(51, 2));
//            antiguedadRepository.save(new Antiguedad(61, 2));
//
//            antiguedadRepository.save(new Antiguedad(12, 3));
//            antiguedadRepository.save(new Antiguedad(22, 3));
//            antiguedadRepository.save(new Antiguedad(32, 3));
//            antiguedadRepository.save(new Antiguedad(42, 3));
//            antiguedadRepository.save(new Antiguedad(52, 3));
//            antiguedadRepository.save(new Antiguedad(62, 3));

//            covenioRepository.save(new Convenio("Hosteleria"));
//            covenioRepository.save(new Convenio("Industria"));
//            covenioRepository.save(new Convenio("Informatica"));
//
//            nominaRepository.save(new Nomina("43231815A",1000,100,10,10000,1100,10,20,30,40,50,60,6,"A"));
//            nominaRepository.save(new Nomina("43241915L", 1000, 100, 10, 10000, 1100, 10, 20, 30, 40, 50, 60, 6, "B"));
//
//            Trabajador trabajador = repository.findByDni("43231815A");
//            SalarioBase profesion = salarioBaseRepository.findById(trabajador.getCategoria());
//            log.info("Trabajador encontrado " + trabajador.getNombre());
//            log.info("===============================================");
//            log.info("Profesion encontrado " + profesion.toString());
//            log.info("===============================================");
        };
    }
}
