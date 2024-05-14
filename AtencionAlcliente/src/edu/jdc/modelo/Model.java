/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.modelo;

import edu.jdc.controller.Cliente;
import edu.jdc.controller.Cola;
import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class Model {
     Cola cola = new Cola();
    int nextTicket = 1;

    public void agregarCliente(String nombre) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del cliente: ");
        String nombre = scanner.next();
        Cliente cliente = new Cliente(nombre, nextTicket++);
        cola.enqueue(cliente);
    }

    public void atenderCliente() {
        Cliente cliente = cola.dequeue();
        if (cliente != null) {
            System.out.println("Atendiendo al cliente " + cliente.nombre + " con ticket " + cliente.ticket);
        }
    }
}

