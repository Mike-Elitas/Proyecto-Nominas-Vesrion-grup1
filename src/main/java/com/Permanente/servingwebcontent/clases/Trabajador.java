package com.Permanente.servingwebcontent.clases;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class Trabajador {
    //Attributes
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String sexo;
    private int categoria;
    private int antiguedad;
    private int extras;
    private float irpf;

    //Constructor
    public Trabajador(String dni, String nombre, String apellido, String fechaNacimiento, String sexo, int categoria, int antiguedad, int extras, float irpf) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        String entry = fechaNacimiento;
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        try {
            this.fechaNacimiento = format.parse(entry);
        } catch (Exception e) {
            e.getMessage();
        }
        this.sexo = sexo;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
        this.extras = extras;
        this.irpf = irpf;
    }

    public Trabajador() {

    }

    //Getters/Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int profesion) {
        this.categoria = profesion;
    }

    public int getAntigüedad() {
        return antiguedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antiguedad = antigüedad;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    //Others Methods
}
