package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.*;

public interface IFactoriaMenu {
    IPlatoPollo crearPlatoPollo();
    IPlatoPescado crearPlatoPescado();
    IBebida crearBebida();
    IPostre crearPostre();
}
