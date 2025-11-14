package com.restaurante.platos.espanoles;

import com.restaurante.platos.abstractos.IPostre;

public class CremaCatalana implements IPostre {
    @Override
    public String obtenerNombre() {
        return "Crema Catalana";
    }

    @Override
    public String obtenerDescripcion() {
        return "Postre a base de yema de huevo con una capa de azúcar caramelizado.";
    }
    @Override
    public String obtenerRutaImagen() {
        return "/images/cremacatalana.png";
    }
}