package com.restaurante.platos.japoneses;

import com.restaurante.platos.abstractos.IPlatoPescado;

public class Sushi {
    @Override
    public String obtenerNombre() {
        return "Sushi Variado";
    }

    @Override
    public String obtenerDescripcion() {
        return "Selección de nigiris y makis de atún y salmón.";
    }
}
