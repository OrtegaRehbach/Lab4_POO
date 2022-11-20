import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Cancion[] cancionesP1 = {
            new Cancion("Cancion1", "Autor1", "3:00", "Genero1"),
            new Cancion("Cancion2", "Autor2", "3:30", "Genero2"),
            new Cancion("Cancion3", "Autor3", "4:00", "Genero3")
        };

        Playlist[] playlists = {
            new Playlist("Playlist1", cancionesP1),
            new Playlist("Playlist2", cancionesP1),
            new Playlist("Playlist3", cancionesP1)
        };
        
        Contacto[] contactos = {
            new Contacto("Contacto1", 12345678),
            new Contacto("Contacto2", 11110000),
            new Contacto("Contacto3", 12341234)
        };

        String[] tarjetasPresentacion = {
            "Tarjeta1",
            "Tarjeta2",
            "Tarjeta3"
        };
        
        Radio radio = new Radio(playlists, contactos, tarjetasPresentacion);
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (exit) {
            if (radio.encendida()) {
                
            } else {
                
            }
        }
        sc.close();

    }   

    private static void mostrarMenuRadioEncendida(Scanner sc, Radio radio) {
        System.out.println(
            ""
        );
    }
}
