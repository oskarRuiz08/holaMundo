/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.modelo;

public class LaberintoModelo {
    private String[] acertijos = {
        "¿Qué siempre va en aumento y nunca disminuye?",
        "¿Qué puede ser tan frágil que se puede romper al caer, pero tan fuerte que nadie puede sostenerlo?",
        "¿Qué palabra de cuatro letras, aunque escrita con tres, está escrita incorrectamente?"
    };

    private String[] respuestas = {
        "edad",
        "silencio",
        "mal"
    };

    private int llavesRecolectadas;

    public LaberintoModelo() {
        llavesRecolectadas = 0;
    }

    public String obtenerAcertijo(int indice) {
        return acertijos[indice];
    }

    public boolean verificarRespuesta(int indice, String respuesta) {
        return respuesta.equalsIgnoreCase(respuestas[indice]);
    }

    public void recolectarLlave() {
        llavesRecolectadas++;
    }

    public boolean todasLasLlavesRecolectadas() {
        return llavesRecolectadas == acertijos.length;
    }

    public int obtenerNumeroAcertijos() {
        return acertijos.length;
    }
}
