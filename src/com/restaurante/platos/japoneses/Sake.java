package com.restaurante.platos.japoneses;
import com.restaurante.platos.abstractos.IBebida;


public class Sake {

    @Override
    public String obtenerNombre() {
        return "Sake";
    }

    @Override
    public String obtenerDescripcion() {
        return "Bebida de arroz fermentado tradicional.";
    }

}
