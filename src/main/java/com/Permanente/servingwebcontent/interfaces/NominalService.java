package com.Permanente.servingwebcontent.interfaces;

import com.Permanente.servingwebcontent.clases.Trabajador;

public interface NominalService {
    float devengos(Trabajador trabajador);

    float deducciones(Trabajador trabajador);

    float aportaciones(Trabajador trabajador);

    float neto(Trabajador trabajador);

    float prorata(Trabajador trabajador);

    float descuentoCC(Trabajador trabajador);

    float descuentoDesempleo(Trabajador trabajador);

    float descuentoFp(Trabajador trabajador);

    float descuentoirpf(Trabajador trabajador);
}
