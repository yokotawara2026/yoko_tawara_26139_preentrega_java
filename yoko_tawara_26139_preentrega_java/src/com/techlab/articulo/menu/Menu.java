package com.techlab.articulo.menu;

import java.util.Scanner;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta debe ser la clase base de todos los menús.
 *
 * Objetivo:
 * centralizar la lógica común para no repetir código.
 *
 * Esta clase debe:
 * [x] guardar un Scanner compartido
 * [x] declarar el método mostrarMenu()
 * [x] declarar el método ejecutar()
 *
 * Además, podés agregar métodos protegidos reutilizables, por ejemplo:
 * - leerEntero(String mensaje)
 * - leerDouble(String mensaje)
 * - leerTexto(String mensaje)
 * - leerSiNo(String mensaje)
 *
 * IMPORTANTE:
 * Esta clase debe ser abstracta, porque no tiene sentido crear un
 * "menú genérico" instanciable. Solo debe servir como base para:
 * - MenuArticulos
 * - MenuCategorias
 */
public abstract class Menu {

    protected Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    
    // Declarar método abstracto para mostrar el menú.
    public abstract void mostrarMenu();

    
    // Declarar método abstracto para ejecutar el menú.
    public abstract void ejecutar();

    
    // Agregar métodos auxiliares de lectura segura si querés reutilizar lógica.
    
    public static int leerEntero(Scanner scanner, String mensaje){
        while (true) {
            try {
                System.out.println(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR. No ingresó un número válido");
            }
        }
    }


    public static double leerDoubleNoNegativo(Scanner scanner, String mensaje){
        while (true) {
            try {
                System.out.println(mensaje);
                double valor = Double.parseDouble(scanner.nextLine());
            
                if (valor <0) {
                    System.out.println("EROOR. el precio no puede ser negativo");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. No es un número decimal válido.");
                }
            }
        }
    

    public static String leerTextoNoVacio(Scanner scanner, String mensaje){
        while (true) {
            System.out.println(mensaje);
            String texto = scanner.nextLine();

            if (!texto.trim().isEmpty()) {
                return texto.trim();
            }

            System.out.println("ERROR. el texto no puede estar vacío.");
        }
    }

    // - leerSiNo(String mensaje)
    /* public static Bool leerSiNo(Scanner scanner, String mensaje){
        while (true) {
            System.out.println(mensaje);
            String texto = scanner.nextLine();

            if (texto.trim().toLowerCase() == "si") {
                return texto.trim();
            }

            System.out.println("ERROR. el texto no puede estar vacío.");
        }
    }*/



}
 

