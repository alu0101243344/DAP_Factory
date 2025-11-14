package com.restaurante.platos.espanoles;

import com.restaurante.platos.abstractos.IBebida;

public class Sangria implements IBebida {
    @Override
    public String obtenerNombre() {
        return "Sangría";
    }

    @Override
    public String obtenerDescripcion() {
        return "Bebida refrescante a base de vino tinto y trozos de fruta.";
    }
}