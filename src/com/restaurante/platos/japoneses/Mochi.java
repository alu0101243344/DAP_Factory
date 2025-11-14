package com.restaurante.platos.japoneses;

import com.restaurante.platos.abstractos.IPostre;

public class Mochi implements IPostre {

    @Override
    public String obtenerNombre() {
        return "Mochi";
    }

    @Override
    public String obtenerDescripcion() {
        return "Pastel de arroz glutinoso relleno de té verde.";
    }
    @Override
    public String obtenerRutaImagen() {
        return "/images/mochi.png";
    }

}
