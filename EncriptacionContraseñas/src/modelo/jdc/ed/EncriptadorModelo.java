/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.jdc.ed;

/**
 *
 * @author osqui
 */
public class EncriptadorModelo {

    private char[] claveEncriptacion;
    private char[] caracteresOriginales;

    // Constructor
    public EncriptadorModelo() {
        claveEncriptacion = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        caracteresOriginales = new char[]{'x', 'z', 'm', 'n', 'p', 'o', 'r', 's', 't', 'u', 'v', 'y', 'a', 'b', 'f', 'e', 'g', 'c', 'h', 'i', 'j', 'k', 'l', 'd', 'q', 'w'};
    }

    // Método para encriptar una contraseña
    public String encriptarContraseña(String contraseña) {
        StringBuilder contraseñaEncriptada = new StringBuilder();

        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            boolean encontrado = false;
            for (int j = 0; j < caracteresOriginales.length; j++) {
                if (caracteresOriginales[j] == caracter) {
                    contraseñaEncriptada.append(claveEncriptacion[j]);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                contraseñaEncriptada.append(caracter); // Si el carácter no está en la clave, se mantiene igual
            }
        }

        return contraseñaEncriptada.toString();
    }
}
