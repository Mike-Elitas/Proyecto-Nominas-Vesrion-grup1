package com.Permanente.servingwebcontent.repository;

import com.Permanente.servingwebcontent.clases.SalarioBase;
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
public interface SalarioBaseRepository extends CrudRepository<SalarioBase,Integer> {
    SalarioBase findAllById(int id);
}