package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.Bebida;
import com.restaurante.platos.abstractos.PlatoPescado;
import com.restaurante.platos.abstractos.PlatoPollo;
import com.restaurante.platos.abstractos.Postre;

public interface FactoriaMenu {
    PlatoPollo crearPlatoPollo();
    PlatoPescado crearPlatoPescado();
    Bebida crearBebida();
    Postre crearPostre();
}
