package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.IBebida;
import com.restaurante.platos.abstractos.IPlatoPescado;
import com.restaurante.platos.abstractos.IPlatoPollo;
import com.restaurante.platos.abstractos.IPostre;

public interface FactoriaMenu {
    PlatoPollo crearPlatoPollo();
    PlatoPescado crearPlatoPescado();
    Bebida crearBebida();
    Postre crearPostre();
}
