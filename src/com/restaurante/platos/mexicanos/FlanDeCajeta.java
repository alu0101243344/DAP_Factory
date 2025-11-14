package com.restaurante.platos.mexicanos;

import com.restaurante.platos.abstractos.IPostre;

public class FlanDeCajeta implements IPostre {
    @Override
    public String obtenerNombre() {
        return "Flan de Cajeta";
    }

    @Override
    public String obtenerDescripcion() {
        return "Flan cremoso bañado en dulce de leche de cabra (cajeta).";
    }
}
