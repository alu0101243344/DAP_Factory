package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.*;
import com.restaurante.platos.japoneses.*;

public class FactoriaMenuJapones {

    @Override
    public PlatoPollo crearPlatoPollo() {
        return new Yakitori();
    }

    @Override
    public PlatoPescado crearPlatoPescado() {
        return new Sushi();
    }

    @Override
    public Bebida crearBebida() {
        return new Sake();
    }

    @Override
    public Postre crearPostre() {
        return new Mochi();
    }

}
