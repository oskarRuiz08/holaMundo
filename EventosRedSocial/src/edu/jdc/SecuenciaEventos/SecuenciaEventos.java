/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.SecuenciaEventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osqui
 */
public class SecuenciaEventos {

    private NodoEvento primero;
    private NodoEvento ultimo;

    public void agregarEvento(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            NodoEvento actual = primero;
            while (actual != null) {
                if (actual.getEvento().getId() > evento.getId()) {
                    if (actual == primero) {
                        nuevoNodo.setSiguiente(primero);
                        primero.setAnterior(nuevoNodo);
                        primero = nuevoNodo;
                    } else {
                        nuevoNodo.setSiguiente(actual);
                        nuevoNodo.setAnterior(actual.getAnterior());
                        actual.getAnterior().setSiguiente(nuevoNodo);
                        actual.setAnterior(nuevoNodo);
                    }
                    return;
                }
                actual = actual.getSiguiente();
            }
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
    }

    public void eliminarEvento(int id) {
        NodoEvento actual = primero;
        while (actual != null) {
            if (actual.getEvento().getId() == id) {
                if (actual == primero && actual == ultimo) {
                    primero = null;
                    ultimo = null;
                } else if (actual == primero) {
                    primero = actual.getSiguiente();
                    primero.setAnterior(null);
                } else if (actual == ultimo) {
                    ultimo = actual.getAnterior();
                    ultimo.setSiguiente(null);
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public List<Evento> buscarEventos(String tipoEvento) {
        List<Evento> eventosEncontrados = new ArrayList<>();
        NodoEvento actual = primero;
        while (actual != null) {
            if (actual.getEvento().getTipo().equals(tipoEvento)) {
                eventosEncontrados.add(actual.getEvento());
            }
            actual = actual.getSiguiente();
        }
        return eventosEncontrados;
    }

    public void listarEventos() {
        NodoEvento actual = primero;
        while (actual != null) {
            System.out.println(actual.getEvento());
            actual = actual.getSiguiente();
        }
    }

    List<Evento> buscarEventos(int idUsuarioBuscar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
