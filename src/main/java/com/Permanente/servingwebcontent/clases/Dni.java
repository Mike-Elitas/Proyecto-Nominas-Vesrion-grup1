package com.Permanente.servingwebcontent.clases;

import org.springframework.stereotype.Component;

/**
 * Project name: DAM20/PACKAGE_NAME
 * Filename:
 * Created:  14/11/2020 / 13:47
 * Description: Esta clase se encargara de almacenar el DNI del trabajador solicitado para finalmente extraer la nomina.
 * Revision:
 *
 * @Author: Ismael - fmartin@nigul.cide.es
 * @Version:
 */
@Component
public class Dni {
    //Attributes
    String dni;
//Builder

    public Dni(String dni) {
        this.dni = dni;
    }

    public Dni() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

//Getters/Setters
//Others Methods
}
