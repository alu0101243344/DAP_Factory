package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.*;
import com.restaurante.platos.japoneses.*;

public class FactoriaMenuJapones implements IFactoriaMenu {

    @Override
    public IPlatoPollo crearPlatoPollo() {
        return new Yakitori();
    }

    @Override
    public IPlatoPescado crearPlatoPescado() {
        return new Sushi();
    }

    @Override
    public IBebida crearBebida() {
        return new Sake();
    }

    @Override
    public IPostre crearPostre() {
        return new Mochi();
    }

}
