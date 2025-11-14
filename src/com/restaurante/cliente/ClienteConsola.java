package com.restaurante.cliente;

import com.restaurante.fabricas.FactoriaMenuEspanol;
import com.restaurante.fabricas.FactoriaMenuJapones;
import com.restaurante.fabricas.FactoriaMenuMexicano;
import com.restaurante.fabricas.IFactoriaMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClienteConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarOpciones();

        try {
            int eleccion = scanner.nextInt();
            IFactoriaMenu factoriaSeleccionada = obtenerFactoriaSegunEleccion(eleccion);

            if (factoriaSeleccionada != null) {
                Menu menuDelDia = new Menu(factoriaSeleccionada);
                menuDelDia.imprimir();
            } else {
                System.out.println("Error: Opción no válida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número válido.");
        }

        System.out.println("\nGracias.");
        scanner.close();
    }

    private static void mostrarOpciones() {
        System.out.println("\n=================================================");
        System.out.println("  BIENVENIDO");
        System.out.println("=================================================");
        System.out.println("Por favor, elige el menú que deseas consultar:");
        System.out.println("  [1] Menú Japonés");
        System.out.println("  [2] Menú Mexicano");
        System.out.println("  [3] Menú Español");
        System.out.print("Tu elección: ");
    }

    private static IFactoriaMenu obtenerFactoriaSegunEleccion(int eleccion) {
        switch (eleccion) {
            case 1:
                return new FactoriaMenuJapones();
            case 2:
                return new FactoriaMenuMexicano();
            case 3:
                return new FactoriaMenuEspanol();
            default:
                return null;
        }
    }
}