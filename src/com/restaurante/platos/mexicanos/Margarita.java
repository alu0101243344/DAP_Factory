package com.restaurante.platos.mexicanos;

import com.restaurante.platos.abstractos.IBebida;

public class Margarita implements IBebida {
    @Override
    public String obtenerNombre() {
        return "Margarita";
    }

    @Override
    public String obtenerDescripcion() {
        return "Cóctel a base de tequila, triple seco y jugo de lima.";
    }
}