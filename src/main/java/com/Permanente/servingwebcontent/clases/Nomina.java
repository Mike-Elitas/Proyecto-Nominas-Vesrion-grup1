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
public class Nomina {
    //Attributes
    private final float CC = 4.70f;
    private final float DESEMPLEO = 1.60f;
    private final float FP = 0.10f;
    private final float HORASEXTRANORMALES = 4.70f;
    private final float HORASEXTRAFURZAMAYOR = 2.00f;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dniTrabajador;
    private float tDevengos;
    private float tDeducciones;
    private float tAportaciones;
    private float tLiquido;
    private float prorata;
    private float descuentoCC;
    private float descuentoDesempleo;
    private float descuentoFp;
    private float descuentoIrpf;
    private String grupo;

    //Builder


    public Nomina(String dniTrabajador, float tDevengos, float tDeducciones, float tAportaciones, float tLiquido, float prorata, float descuentoCC, float descuentoDesempleo, float descuentoFp, float descuentoIrpf, String grupo) {
        this.dniTrabajador = dniTrabajador;
        this.tDevengos = tDevengos;
        this.tDeducciones = tDeducciones;
        this.tAportaciones = tAportaciones;
        this.tLiquido = tLiquido;
        this.prorata = prorata;
        this.descuentoCC = descuentoCC;
        this.descuentoDesempleo = descuentoDesempleo;
        this.descuentoFp = descuentoFp;
        this.descuentoIrpf = descuentoIrpf;

        if (grupo.equals("A")) {
            this.grupo = grupo;
        } else if (grupo.equals("B")) {
            this.grupo = grupo;
        } else if (grupo.equals("C")) {
            this.grupo = grupo;
        }
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

    public float getDescuentoIrpf() {
        return descuentoIrpf;
    }

    public void setDescuentoIrpf(float descuentoIrpf) {
        this.descuentoIrpf = descuentoIrpf;
    }

    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

    public float getCC() {
        return CC;
    }

    public float getDESEMPLEO() {
        return DESEMPLEO;
    }

    public float getFP() {
        return FP;
    }

    public float getHORASEXTRANORMALES() {
        return HORASEXTRANORMALES;
    }

    public float getHORASEXTRAFURZAMAYOR() {
        return HORASEXTRAFURZAMAYOR;
    }

    public float gettDevengos() {
        return tDevengos;
    }

    public void settDevengos(float tDevengos) {
        this.tDevengos = tDevengos;
    }

    public float gettDeducciones() {
        return tDeducciones;
    }

    public void settDeducciones(float tDeducciones) {
        this.tDeducciones = tDeducciones;
    }

    public float gettAportaciones() {
        return tAportaciones;
    }

    public void settAportaciones(float tAportaciones) {
        this.tAportaciones = tAportaciones;
    }

    public float gettLiquido() {
        return tLiquido;
    }

    public void settLiquido(float tLiquido) {
        this.tLiquido = tLiquido;
    }

    public float getProrata() {
        return prorata;
    }

    public void setProrata(float prorata) {
        this.prorata = prorata;
    }

    public float getDescuentoCC() {
        return descuentoCC;
    }

    public void setDescuentoCC(float descuentoCC) {
        this.descuentoCC = descuentoCC;
    }

    public float getDescuentoDesempleo() {
        return descuentoDesempleo;
    }

    public void setDescuentoDesempleo(float descuentoDesempleo) {
        this.descuentoDesempleo = descuentoDesempleo;
    }

    public float getDescuentoFp() {
        return descuentoFp;
    }

    public void setDescuentoFp(float descuentoFp) {
        this.descuentoFp = descuentoFp;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    //Others Methods
}
