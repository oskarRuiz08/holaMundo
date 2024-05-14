/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.SecuenciaEventos;

/**
 *
 * @author osqui
 */
public class Evento {
    private int id;
    private String tipo;
    private int idUsuario;
    private String fechaHora;
    private String contenido;

    public Evento(int id, String tipo, int idUsuario, String fechaHora, String contenido) {
        this.id = id;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    // Getters y setters
    public void setContenido(String contenido) {      
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tipo: " + tipo + ", Usuario: " + idUsuario + ", Fecha/Hora: " + fechaHora + ", Contenido: " + contenido;
    }
}

