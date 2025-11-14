package com.restaurante.fabricas;

import com.restaurante.platos.abstractos.*;
import com.restaurante.platos.mexicanos.*;

public class FactoriaMenuMexicano implements IFactoriaMenu {
    @Override
    public IPlatoPollo crearPlatoPollo() {
        return new PolloPibil();
    }

    @Override
    public IPlatoPescado crearPlatoPescado() {
        return new Ceviche();
    }

    @Override
    public IBebida crearBebida() {
        return new Margarita();
    }

    @Override
    public IPostre crearPostre() {
        return new FlanDeCajeta();
    }
}
