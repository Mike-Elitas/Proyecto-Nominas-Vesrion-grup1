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
public class Antiguedad {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int liquido;
    int idConvenio;

    //Builder
    public Antiguedad(int liquido, int idConvenio) {
        this.liquido = liquido;
        this.idConvenio = idConvenio;
    }

    public Antiguedad() {
    }

    //Getters/Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLiquido() {
        return liquido;
    }

    public void setLiquido(int liquido) {
        this.liquido = liquido;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }
}
