

package edu.ldc.controlador;

import edu.jdc.modelo.LaberintoModelo;
import edu.jdc.vista.LaberintoVista;

public class LaberintoControlador {
    private LaberintoModelo modelo;
    private LaberintoVista vista;

    public LaberintoControlador(LaberintoModelo modelo, LaberintoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void comenzarJuego() {
        vista.mostrarMensaje("¡Bienvenido a la Ciudad de los Laberintos!");
        vista.mostrarMensaje("En este laberinto, debes resolver acertijos para recolectar llaves y alcanzar tu tesoro.");
        vista.mostrarMensaje("¡Buena suerte!\n");

        for (int i = 0; i < modelo.obtenerNumeroAcertijos(); i++) {
            vista.mostrarMensaje("Acertijo " + (i + 1) + ":");
            vista.mostrarMensaje(modelo.obtenerAcertijo(i));
            vista.mostrarMensaje("Respuesta: ");
            String respuesta = vista.obtenerRespuesta();

            if (modelo.verificarRespuesta(i, respuesta)) {
                vista.mostrarMensaje("¡Correcto! Has obtenido una llave.");
                modelo.recolectarLlave();
            } else {
                vista.mostrarMensaje("Respuesta incorrecta. Sigue intentando.");
            }
            vista.mostrarMensaje(""); 
        }

        if (modelo.todasLasLlavesRecolectadas()) {
            vista.mostrarMensaje("¡Felicidades! Has recolectado todas las llaves y alcanzado el tesoro.");
        } else {
            vista.mostrarMensaje("Lo siento, no has recolectado todas las llaves. No has alcanzado el tesoro.");
        }
        vista.cerrarScanner();
    }
}