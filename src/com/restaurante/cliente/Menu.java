package com.restaurante.cliente;
import com.restaurante.fabricas.IFactoriaMenu;
import com.restaurante.platos.abstractos.*;

public class Menu {

    private final IPlatoPollo pollo;
    private final IPlatoPescado pescado;
    private final IBebida bebida;
    private final IPostre postre;

    public IPlatoPollo getPollo() {
        return pollo;
    }

    public IPlatoPescado getPescado() {
        return pescado;
    }

    public IBebida getBebida() {
        return bebida;
    }

    public IPostre getPostre() {
        return postre;
    }

    public Menu(IFactoriaMenu factoria) {
        this.pollo = factoria.crearPlatoPollo();
        this.pescado = factoria.crearPlatoPescado();
        this.bebida = factoria.crearBebida();
        this.postre = factoria.crearPostre();
    }

    public void imprimir() {
        System.out.println("======================================");
        System.out.println("MENÚ DEL DÍA");
        System.out.println("--------------------------------------");
        System.out.println("Pollo: " + pollo.obtenerNombre());
        System.out.println("   -> " + pollo.obtenerDescripcion());
        System.out.println("Pescado: " + pescado.obtenerNombre());
        System.out.println("   -> " + pescado.obtenerDescripcion());
        System.out.println("Bebida: " + bebida.obtenerNombre());
        System.out.println("   -> " + bebida.obtenerDescripcion());
        System.out.println("Postre: " + postre.obtenerNombre());
        System.out.println("   -> " + postre.obtenerDescripcion());
        System.out.println("======================================");
    }
}


