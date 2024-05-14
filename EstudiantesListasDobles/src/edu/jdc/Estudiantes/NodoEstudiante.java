/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.Estudiantes;

/**
 *
 * @author osqui
 */
public class NodoEstudiante {
     private Estudiante estudiante;
    private NodoEstudiante anterior;
    private NodoEstudiante siguiente;

    public NodoEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.anterior = null;
        this.siguiente = null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public NodoEstudiante getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEstudiante anterior) {
        this.anterior = anterior;
    }

    public NodoEstudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstudiante siguiente) {
        this.siguiente = siguiente;
    }
}
