package com.restaurante.platos.japoneses;

import com.restaurante.platos.abstractos.IPlatoPescado;

public class Sushi implements IPlatoPescado {
    @Override
    public String obtenerNombre() {
        return "Sushi Variado";
    }

    @Override
    public String obtenerDescripcion() {
        return "Selección de nigiris y makis de atún y salmón.";
    }
    @Override
    public String obtenerRutaImagen() {
        return "/images/sushi.png";
    }
}
