/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.vista;

import edu.jdc.modelo.Model;
import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class View {
    private Model model;
    private Scanner scanner;

    public View(Model model, Scanner scanner) {
        this.model = model;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Agregar un nuevo cliente a la cola.");
            System.out.println("2. Atender al siguiente cliente en la cola.");
            System.out.println("3. Salir.");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del cliente: ");
                    String nombre = scanner.next();
                    model.agregarCliente(nombre);
                    break;
                case 2:
                    model.atenderCliente();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

