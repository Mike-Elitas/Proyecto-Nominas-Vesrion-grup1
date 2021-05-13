package com.Permanente.servingwebcontent.interfaces;

import com.Permanente.servingwebcontent.clases.Trabajador;

/**
 * Esta interfaz es donde se instancian lo metodos necesarios con lo que cada uno requiere para calcular datos y posteriormente plasmarlos en la nomina.
 */

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
