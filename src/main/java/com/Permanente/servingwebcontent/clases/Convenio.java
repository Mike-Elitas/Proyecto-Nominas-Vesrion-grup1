package com.Permanente.servingwebcontent.clases;

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
public class Convenio {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nombre;
//Builder


    public Convenio(String nombre) {
        this.nombre = nombre;
    }

    public Convenio() {
    }
    //Getters/Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Others Methods
}
