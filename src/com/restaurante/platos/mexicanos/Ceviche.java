package com.restaurante.platos.mexicanos;

import com.restaurante.platos.abstractos.IPlatoPescado;

public class Ceviche implements IPlatoPescado {
    @Override
    public String obtenerNombre() {
        return "Ceviche";
    }

    @Override
    public String obtenerDescripcion() {
        return "Pescado fresco marinado en jugo de lima con cilantro, cebolla y chile.";
    }
    @Override
    public String obtenerRutaImagen() {
        return "/images/ceviche.png";
    }
}
