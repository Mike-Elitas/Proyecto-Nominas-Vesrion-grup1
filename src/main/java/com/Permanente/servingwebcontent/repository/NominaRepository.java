package com.Permanente.servingwebcontent.repository;

import com.Permanente.servingwebcontent.clases.Nomina;
import com.Permanente.servingwebcontent.clases.Trabajador;
import org.springframework.data.repository.CrudRepository;

/**
 * Project name: DAM20/PACKAGE_NAME
 * Filename:
 * Created:  14/11/2020 / 13:47
 * Description:
 * Revision:
 *
 * @Author: Ismael - fmartin@nigul.cide.es
 * @Version:
 */
public interface NominaRepository extends CrudRepository<Nomina,Integer> {
    Nomina findByDniTrabajador(String dni);
}
