package com.restaurante.platos.espanoles;

import com.restaurante.platos.abstractos.IPlatoPollo;

public class PolloAlAjillo implements IPlatoPollo {
    @Override
    public String obtenerNombre() {
        return "Pollo al Ajillo";
    }

    @Override
    public String obtenerDescripcion() {
        return "Trozos de pollo fritos con abundantes ajos laminados y vino blanco.";
    }
}