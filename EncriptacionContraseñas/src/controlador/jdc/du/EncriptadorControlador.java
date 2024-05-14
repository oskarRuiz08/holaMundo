/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.jdc.du;

import modelo.jdc.ed.EncriptadorModelo;
import vista.jdc.edu.EncriptadorVista;

/**
 *
 * @author osqui
 */
public class EncriptadorControlador {

    private EncriptadorModelo modelo;
    private EncriptadorVista vista;

    // Constructor
    public EncriptadorControlador(EncriptadorModelo modelo, EncriptadorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Método para iniciar el proceso de encriptación
    public void encriptarContraseña() {
        boolean otraVez = true;
        while (otraVez) {
            String contraseña = vista.obtenerContraseña();
            String contraseñaEncriptada = modelo.encriptarContraseña(contraseña);
            vista.mostrarContraseñaEncriptada(contraseñaEncriptada);
            otraVez = vista.preguntarOtraVez();
        }
        vista.despedirse();
    }
}
