package Vista.jdc;

public class VistaCine {

    public void mostrarCartelera(List<Pelicula> peliculas) {
        System.out.println("Cartelera:");
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).getNombre());
        }
    }
}

public void mostrarSalas(List<Sala> salas) {
        System.out.println("\nSalas Disponibles:");
        for (Sala sala : salas) {
            System.out.println("Sala
