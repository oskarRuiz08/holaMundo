package edu.jdc.Estudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante al final");
            System.out.println("2. Agregar estudiante al principio");
            System.out.println("3. Eliminar estudiante del final");
            System.out.println("4. Eliminar estudiante del principio");
            System.out.println("5. Mostrar listado de estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 
                    listaEstudiantes.agregarEstudianteAlFinal(new Estudiante(nombre, edad));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreInicio = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edadInicio = scanner.nextInt();
                    scanner.nextLine(); 
                    listaEstudiantes.agregarEstudianteAlPrincipio(new Estudiante(nombreInicio, edadInicio));
                    break;
                case 3:
                    Estudiante estudianteEliminadoFinal = listaEstudiantes.eliminarEstudianteDelFinal();
                    if (estudianteEliminadoFinal != null) {
                        System.out.println("Se eliminó el estudiante del final: " + estudianteEliminadoFinal);
                    } else {
                        System.out.println("La lista de estudiantes está vacía.");
                    }
                    break;
                case 4:
                    Estudiante estudianteEliminadoInicio = listaEstudiantes.eliminarEstudianteDelPrincipio();
                    if (estudianteEliminadoInicio != null) {
                        System.out.println("Se eliminó el estudiante del principio: " + estudianteEliminadoInicio);
                    } else {
                        System.out.println("La lista de estudiantes está vacía.");
                    }
                    break;
                case 5:
                    listaEstudiantes.mostrarListadoEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}


