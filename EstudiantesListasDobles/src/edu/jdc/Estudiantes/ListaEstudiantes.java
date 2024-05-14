/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.Estudiantes;

/**
 *
 * @author osqui
 */
public class ListaEstudiantes {
     private NodoEstudiante primero;
    private NodoEstudiante ultimo;

    public void agregarEstudianteAlFinal(Estudiante estudiante) {
        NodoEstudiante nuevoNodo = new NodoEstudiante(estudiante);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public void agregarEstudianteAlPrincipio(Estudiante estudiante) {
        NodoEstudiante nuevoNodo = new NodoEstudiante(estudiante);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        }
    }
    public Estudiante eliminarEstudianteDelFinal() {
        if (ultimo == null) {
            return null;
        }
        Estudiante estudianteEliminado = ultimo.getEstudiante();
        if (primero == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
        }
        return estudianteEliminado;
    }

    public Estudiante eliminarEstudianteDelPrincipio() {
        if (primero == null) {
            return null;
        }
        Estudiante estudianteEliminado = primero.getEstudiante();
        if (primero == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getSiguiente();
            primero.setAnterior(null);
        }
        return estudianteEliminado;
    }

    public void mostrarListadoEstudiantes() {
        System.out.println("Listado de Estudiantes:");
        NodoEstudiante actual = primero;
        while (actual != null) {
            System.out.println(actual.getEstudiante());
            actual = actual.getSiguiente();
        }
    }

}
