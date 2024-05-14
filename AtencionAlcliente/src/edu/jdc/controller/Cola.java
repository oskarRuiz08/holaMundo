/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.controller;

/**
 *
 * @author osqui
 */
public class Cola {
    final int MAX = 1000;
    int front, rear;
    Cliente[] arr = new Cliente[MAX];

    Cola() {
        front = rear = -1;
    }

    void enqueue(Cliente cliente) {
        if (rear == MAX - 1)
            System.out.println("Cola llena. No se puede agregar más clientes.");
        else {
            if (front == -1)
                front = 0;
            rear++;
            arr[rear] = cliente;
        }
    }

    Cliente dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Cola vacía. No hay clientes en espera.");
            return null;
        } else {
            Cliente cliente = arr[front];
            front++;
            if (front > rear) {
                front = rear = -1;
            }
            return cliente;
        }
    }

    boolean isEmpty() {
        return (front == -1 || front > rear);
    }
}
