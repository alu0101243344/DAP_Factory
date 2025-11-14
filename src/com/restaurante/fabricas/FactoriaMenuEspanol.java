package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.*;
import com.restaurante.platos.espanoles.*;

public class FactoriaMenuEspanol implements IFactoriaMenu {
    @Override
    public IPlatoPollo crearPlatoPollo() {
        return new PolloAlAjillo();
    }

    @Override
    public IPlatoPescado crearPlatoPescado() {
        return new MerluzaEnSalsaVerde();
    }

    @Override
    public IBebida crearBebida() {
        return new Sangria();
    }

    @Override
    public IPostre crearPostre() {
        return new CremaCatalana();
    }
}