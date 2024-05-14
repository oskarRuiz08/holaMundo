/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.SecuenciaEventos;

/**
 *
 * @author osqui
 */
public class NodoEvento {
    private Evento evento;
    private NodoEvento anterior;
    private NodoEvento siguiente;

    public NodoEvento(Evento evento) {
        this.evento = evento;
        this.anterior = null;
        this.siguiente = null;
    }

    // Getters y setters

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public NodoEvento getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEvento anterior) {
        this.anterior = anterior;
    }

    public NodoEvento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEvento siguiente) {
        this.siguiente = siguiente;
    }
    
}
