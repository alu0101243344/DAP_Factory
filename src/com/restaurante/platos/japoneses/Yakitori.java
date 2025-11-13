package com.restaurante.platos.japoneses;

import com.restaurante.platos.abstractos.IPlatoPollo;
public class Yakitori {
    @Override
    public String obtenerNombre() {
        return "Yakitori";
    }

    @Override
    public String obtenerDescripcion() {
        return "Brochetas de pollo a la parrilla con salsa teriyaki.";
    }

}

