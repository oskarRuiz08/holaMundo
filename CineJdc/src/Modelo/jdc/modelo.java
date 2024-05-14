
package Modelo.jdc;

import java.util.ArrayList;
import java.util.List;

public class modelo {
    

class Pelicula {
    private String nombre;

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Sala {
    private int numero;
    private String tipo;

    public Sala(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
}

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Pedido {
    private Pelicula pelicula;
    private Sala sala;
    private Usuario usuario;
    private double precio;
            
        public Pedido(Pelicula pelicula, Sala sala, Usuario usuario, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.usuario = usuario;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getPrecio() {
        return precio;
    }
}

}
