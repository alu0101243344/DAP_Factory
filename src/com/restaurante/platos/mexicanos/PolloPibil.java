package com.restaurante.platos.mexicanos;

import com.restaurante.platos.abstractos.IPlatoPollo;

public class PolloPibil implements IPlatoPollo {
    @Override
    public String obtenerNombre() {
        return "Pollo Pibil";
    }

    @Override
    public String obtenerDescripcion() {
        return "Pollo marinado en achiote, envuelto en hoja de plátano y cocido lentamente.";
    }
    @Override
    public String obtenerRutaImagen() {
        return "/images/pollopibil.png";
    }
}