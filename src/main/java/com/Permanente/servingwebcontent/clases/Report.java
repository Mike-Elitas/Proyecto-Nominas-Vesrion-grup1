package com.Permanente.servingwebcontent.clases;

import com.Permanente.servingwebcontent.repository.AntiguedadRepository;
import com.Permanente.servingwebcontent.repository.NominaRepository;
import com.Permanente.servingwebcontent.repository.SalarioBaseRepository;
import com.Permanente.servingwebcontent.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Report {


    private String nombre;
    private String apellido;
    private String dni_trabajador;
    private String grupo;
    private int salario;
    private int liquido;
    private int extras;
    private int categoria;
    private int id;
    private float cc;
    private float desempleo;
    private float fp;
    private float horasextrafurzamayor;
    private float horasextranormales;
    private float descuentocc;
    private float descuento_desempleo;
    private float descuento_fp;
    private float descuento_hextra_fueza_mayor;
    private float descuento_hextra_normales;
    private float descuento_irpf;
    private float irpf;
    private float prorata;
    private float t_aportaciones;
    private float t_deducciones;
    private float t_devengos;
    private float t_liquido;

    public Report() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni_trabajador() {
        return dni_trabajador;
    }

    public void setDni_trabajador(String dni_trabajador) {
        this.dni_trabajador = dni_trabajador;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getLiquido() {
        return liquido;
    }

    public void setLiquido(int liquido) {
        this.liquido = liquido;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }

    public float getDesempleo() {
        return desempleo;
    }

    public void setDesempleo(float desempleo) {
        this.desempleo = desempleo;
    }

    public float getFp() {
        return fp;
    }

    public void setFp(float fp) {
        this.fp = fp;
    }

    public float getHorasextrafurzamayor() {
        return horasextrafurzamayor;
    }

    public void setHorasextrafurzamayor(float horasextrafurzamayor) {
        this.horasextrafurzamayor = horasextrafurzamayor;
    }

    public float getHorasextranormales() {
        return horasextranormales;
    }

    public void setHorasextranormales(float horasextranormales) {
        this.horasextranormales = horasextranormales;
    }

    public float getDescuentocc() {
        return descuentocc;
    }

    public void setDescuentocc(float descuentocc) {
        this.descuentocc = descuentocc;
    }

    public float getDescuento_desempleo() {
        return descuento_desempleo;
    }

    public void setDescuento_desempleo(float descuento_desempleo) {
        this.descuento_desempleo = descuento_desempleo;
    }

    public float getDescuento_fp() {
        return descuento_fp;
    }

    public void setDescuento_fp(float descuento_fp) {
        this.descuento_fp = descuento_fp;
    }

    public float getDescuento_hextra_fueza_mayor() {
        return descuento_hextra_fueza_mayor;
    }

    public void setDescuento_hextra_fueza_mayor(float descuento_hextra_fueza_mayor) {
        this.descuento_hextra_fueza_mayor = descuento_hextra_fueza_mayor;
    }

    public float getDescuento_hextra_normales() {
        return descuento_hextra_normales;
    }

    public void setDescuento_hextra_normales(float descuento_hextra_normales) {
        this.descuento_hextra_normales = descuento_hextra_normales;
    }

    public float getDescuento_irpf() {
        return descuento_irpf;
    }

    public void setDescuento_irpf(float descuento_irpf) {
        this.descuento_irpf = descuento_irpf;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public float getProrata() {
        return prorata;
    }

    public void setProrata(float prorata) {
        this.prorata = prorata;
    }

    public float getT_aportaciones() {
        return t_aportaciones;
    }

    public void setT_aportaciones(float t_aportaciones) {
        this.t_aportaciones = t_aportaciones;
    }

    public float getT_deducciones() {
        return t_deducciones;
    }

    public void setT_deducciones(float t_deducciones) {
        this.t_deducciones = t_deducciones;
    }

    public float getT_devengos() {
        return t_devengos;
    }

    public void setT_devengos(float t_devengos) {
        this.t_devengos = t_devengos;
    }

    public float getT_liquido() {
        return t_liquido;
    }

    public void setT_liquido(float t_liquido) {
        this.t_liquido = t_liquido;
    }

}
