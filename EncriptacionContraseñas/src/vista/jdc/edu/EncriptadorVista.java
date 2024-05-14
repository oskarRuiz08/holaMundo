/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.jdc.edu;

import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class EncriptadorVista {

    private Scanner scanner;

    // Constructor
    public EncriptadorVista() {
        scanner = new Scanner(System.in);
    }

    // Método para obtener la contraseña del usuario
    public String obtenerContraseña() {
        System.out.println("Ingrese la contraseña a encriptar:");
        return scanner.nextLine();
    }

    // Método para mostrar la contraseña encriptada
    public void mostrarContraseñaEncriptada(String contraseñaEncriptada) {
        System.out.println("La contraseña encriptada es:");
        System.out.println(contraseñaEncriptada);
    }

    // Método para preguntar al usuario si desea encriptar otra contraseña
    public boolean preguntarOtraVez() {
        System.out.println("¿Desea encriptar otra contraseña? (s/n)");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("s");
    }

    // Método para despedirse
    public void despedirse() {
        System.out.println("¡Hasta luego!");
    }
}
