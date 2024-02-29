package edu.jdc.vista;

import java.util.Scanner;

public class LaberintoVista {

    private Scanner scanner;

    public LaberintoVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerRespuesta() {
        return scanner.nextLine();
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
