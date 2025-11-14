package com.restaurante.cliente;
import com.restaurante.fabricas.FactoriaMenuMexicano;
import com.restaurante.fabricas.IFactoriaMenu;
import com.restaurante.fabricas.FactoriaMenuJapones;

public class ClienteConsola {
    public static void main(String[] args) {
        System.out.println("Probando el patrón Abstract Factory con el menú japonés...");

        IFactoriaMenu factoria = new FactoriaMenuMexicano();
        Menu menuDelDia = new Menu(factoria);

        menuDelDia.imprimir();
    }

}

