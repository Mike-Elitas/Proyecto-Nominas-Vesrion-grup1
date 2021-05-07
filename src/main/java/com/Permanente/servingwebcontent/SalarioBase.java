package com.Permanente.servingwebcontent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
@Entity
public class SalarioBase {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int salario;
    int idConvenio;

    //Builder

    public SalarioBase() {
    }

    public SalarioBase(int salario, int idConvenio) {
        this.salario = salario;
        this.idConvenio = idConvenio;
    }

    //Gtters/Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

//Others Methods

    @Override
    public String toString() {
        return "Profesion{" +
                "id=" + id +
                ", salario=" + salario +
                '}';
    }
}
