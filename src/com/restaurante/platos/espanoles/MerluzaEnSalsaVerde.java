package com.restaurante.platos.espanoles;

import com.restaurante.platos.abstractos.IPlatoPescado;

public class MerluzaEnSalsaVerde implements IPlatoPescado {
    @Override
    public String obtenerNombre() {
        return "Merluza en Salsa Verde";
    }

    @Override
    public String obtenerDescripcion() {
        return "Lomos de merluza cocinados en una salsa a base de perejil, ajo y almejas.";
    }
}