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
public class Nomina {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int salarioB;
    int antiguedad;
    float extras;
    float ss;
    float irpf;
    float tBruto;
    float descuentoSs;
    float descuentoIrpf;
    float tNeto;
    String dniTrabajador;
//Builder

    public Nomina(int id, int salarioB, int antiguedad, float extras, float ss, float irpf, float tBruto, float descuentoSs, float descuentoIrpf, float tNeto, String dniTrabajador) {
        this.id = id;
        this.salarioB = salarioB;
        this.antiguedad = antiguedad;
        this.extras = extras;
        this.ss = ss;
        this.irpf = irpf;
        this.tBruto = tBruto;
        this.descuentoSs = descuentoSs;
        this.descuentoIrpf = descuentoIrpf;
        this.tNeto = tNeto;
        this.dniTrabajador = dniTrabajador;
    }

    public Nomina() {
    }
//Getters/Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalarioB() {
        return salarioB;
    }

    public void setSalarioB(int salarioB) {
        this.salarioB = salarioB;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getExtras() {
        return extras;
    }

    public void setExtras(float extras) {
        this.extras = extras;
    }

    public float getSs() {
        return ss;
    }

    public void setSs(float ss) {
        this.ss = ss;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public float gettBruto() {
        return tBruto;
    }

    public void settBruto(float tBruto) {
        this.tBruto = tBruto;
    }

    public float getDescuentoSs() {
        return descuentoSs;
    }

    public void setDescuentoSs(float descuentoSs) {
        this.descuentoSs = descuentoSs;
    }

    public float getDescuentoIrpf() {
        return descuentoIrpf;
    }

    public void setDescuentoIrpf(float descuentoIrpf) {
        this.descuentoIrpf = descuentoIrpf;
    }

    public float gettNeto() {
        return tNeto;
    }

    public void settNeto(float tNeto) {
        this.tNeto = tNeto;
    }

    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

//Others Methods
}
