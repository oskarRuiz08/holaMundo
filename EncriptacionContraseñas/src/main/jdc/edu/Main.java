/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.jdc.edu;

import controlador.jdc.du.EncriptadorControlador;
import java.util.Scanner;
import modelo.jdc.ed.EncriptadorModelo;
import vista.jdc.edu.EncriptadorVista;

/**
 *
 * @author osqui
 */
public class Main {

    public static void main(String[] args) {
        EncriptadorModelo modelo = new EncriptadorModelo();
        EncriptadorVista vista = new EncriptadorVista();
        EncriptadorControlador controlador = new EncriptadorControlador(modelo, vista);

        // Iniciar el proceso de encriptación
        controlador.encriptarContraseña();
    }
}