
package edu.jdc.SecuenciaEventos;

/**
 *
 * @author osqui
 */
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SecuenciaEventos secuenciaEventos = new SecuenciaEventos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar evento");
            System.out.println("2. Eliminar evento por ID");
            System.out.println("3. Buscar eventos por tipo");
            System.out.println("4. Buscar eventos por ID de usuario");
            System.out.println("5. Listar todos los eventos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del evento: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese el tipo de evento: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese el ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese la fecha y hora del evento: ");
                    String fechaHora = scanner.nextLine();
                    System.out.print("Ingrese el contenido del evento: ");
                    String contenido = scanner.nextLine();
                    Evento evento = new Evento(id, tipo, idUsuario, fechaHora, contenido);
                    secuenciaEventos.agregarEvento(evento);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del evento a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    secuenciaEventos.eliminarEvento(idEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el tipo de evento a buscar: ");
                    String tipoBuscar = scanner.nextLine();
                    List<Evento> eventosPorTipo = secuenciaEventos.buscarEventos(tipoBuscar);
                    System.out.println("Eventos encontrados:");
                    for (Evento e : eventosPorTipo) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID de usuario a buscar: ");
                    int idUsuarioBuscar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    List<Evento> eventosPorUsuario = secuenciaEventos.buscarEventos(idUsuarioBuscar);
                    System.out.println("Eventos encontrados:");
                    for (Evento e : eventosPorUsuario) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Listado de eventos:");
                    secuenciaEventos.listarEventos();
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
