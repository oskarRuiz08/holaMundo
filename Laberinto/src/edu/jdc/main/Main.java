/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.main;

import edu.jdc.modelo.LaberintoModelo;
import edu.jdc.vista.LaberintoVista;
import edu.ldc.controlador.LaberintoControlador;

public class Main {
    public static void main(String[] args) {
        LaberintoModelo modelo = new LaberintoModelo();
        LaberintoVista vista = new LaberintoVista();
        LaberintoControlador controlador = new LaberintoControlador(modelo, vista);
        controlador.comenzarJuego();
    }
}

