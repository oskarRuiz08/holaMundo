package ejemploAloritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nombres {

    public static void main(String[] args) {
        String[] nombres = {
            "Juan Sebastian Acosta Quiroz",
            "Brayan Estiven Acuña Daza",
            "Jonathan Alexander Arcos Molano",
            "Andres Felipe Blanco Vega",
            "Kevin Danilo Bolivar Suarez",
            "Daniel Felipe Bonilla Vargas",
            "Duvan Felipe Castro Molina",
            "Karen Dayana Fonseca Suarez",
            "Jehison Andres Forero Martinez",
            "Elkin Santiago Lopez Fonseca",
            "Cesar Miguel Lopez Hernandez",
            "Jairo Yesid Martinez Gonzalez",
            "Jhonatan David Martinez Ramirez",
            "Jheisson Alejandro Mojica Lucero",
            "Erick Julian Mora Gordo",
            "Sergio Estiven Moreno Arias",
            "Leidy Mariana Nino Gonzalez",
            "Robinson Daniand Orjuela Robayo",
            "Karen Sofia Parra Granados",
            "Jhon Dario Puentes Arias",
            "Maira Alejandra Rangel Murillo",
            "Maria Camila Robles Diaz",
            "Oscar Fernando Ruiz Ruiz",
            "Cesar Andres Saenz Cuervo",
            "Juan Sebastian Sanchez Leon",
            "Luis Silvestre Supelano Beltran"
        };

        // Crear vectores para cada letra del alfabeto
        List<String>[] arregloListas = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
        	arregloListas[i] = new ArrayList<>();
        }

        // Agrupar los nombres en los vectores correspondientes
        for (String nombre : nombres) {
            char primeraLetra = Character.toUpperCase(nombre.charAt(0));
            int indice = primeraLetra - 'A';
            for (int i = 0; i < 26; i++) {
                if (indice == i) {
                	arregloListas[i].add(nombre);
                    break;
                }
            }
        }

        // Ordenar los nombres dentro de cada vector
        for (List<String> vector : arregloListas) {
            Collections.sort(vector);
        }

        // Imprimir los nombres agrupados por la primera letra y ordenados alfabéticamente
        for (int i = 0; i < 26; i++) {
            if (!arregloListas[i].isEmpty()) {
                char letra = (char) ('A' + i);
                System.out.println("Nombres con la letra " + letra + ":");
                for (String nombre : arregloListas[i]) {
                    System.out.println(nombre);
                }
                System.out.println();
            }
        }
    }
}
