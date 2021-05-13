package com.Permanente.servingwebcontent.interfacesImp;

import com.Permanente.servingwebcontent.clases.Antiguedad;
import com.Permanente.servingwebcontent.clases.SalarioBase;
import com.Permanente.servingwebcontent.clases.Trabajador;
import com.Permanente.servingwebcontent.interfaces.NominalService;
import com.Permanente.servingwebcontent.repository.AntiguedadRepository;
import com.Permanente.servingwebcontent.repository.SalarioBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NominalServiceImp implements NominalService {
    private final float CC = 4.70f;
    private final float DESEMPLEO = 1.60f;
    private final float FP = 0.10f;

    @Autowired
    SalarioBaseRepository salarioBaseRepository;
    @Autowired
    AntiguedadRepository antiguedadRepository;

    @Override
    public float devengos(Trabajador trabajador) {
        SalarioBase salarioBase = salarioBaseRepository.findById(trabajador.getCategoria());
        Antiguedad antiguedad = antiguedadRepository.findById(trabajador.getAntigüedad());
        return salarioBase.getSalario() + antiguedad.getLiquido() + trabajador.getExtras();
    }

    @Override
    public float deducciones(Trabajador trabajador) {
        return aportaciones(trabajador) + descuentoirpf(trabajador);
    }

    @Override
    public float aportaciones(Trabajador trabajador) {
        return descuentoCC(trabajador) + descuentoDesempleo(trabajador) + descuentoFp(trabajador);
    }

    @Override
    public float neto(Trabajador trabajador) {
        return devengos(trabajador) - deducciones(trabajador);
    }

    @Override
    public float prorata(Trabajador trabajador) {
        SalarioBase salarioBase = salarioBaseRepository.findById(trabajador.getCategoria());
        float prorata = salarioBase.getSalario() / 14;
        float prorataBruto = devengos(trabajador) + prorata;
        return prorataBruto;
    }

    @Override
    public float descuentoCC(Trabajador trabajador) {
        float descuento = prorata(trabajador) / 100 * CC;
        return descuento;
    }

    @Override
    public float descuentoDesempleo(Trabajador trabajador) {
        float descuento = prorata(trabajador) / 100 * DESEMPLEO;
        return descuento;
    }

    @Override
    public float descuentoFp(Trabajador trabajador) {
        float descuento = prorata(trabajador) / 100 * FP;
        return descuento;
    }

    @Override
    public float descuentoirpf(Trabajador trabajador) {
        float descueto = devengos(trabajador) / 100 * trabajador.getIrpf();
        return descueto;
    }
}
