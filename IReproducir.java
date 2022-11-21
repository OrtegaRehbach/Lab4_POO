// Universidad del Valle de Guatemala
// Programación Orientada a ObjetoS, Sección 20
// Ludwing Cano
// Adrian Recinos, Alejandro Ortega, Fernando Echeverria
import java.util.ArrayList;

public interface IReproducir {
    
    /** Imprime la lista de canciones dada y devuelve la cancion seleccionada*/
    void seleccionarListaReproduccion(ArrayList<String> canciones);

    /* Se podra cambiar tanto para adelante como para atrás*/
    void cambiarCancion(String Cancion);
    
    /*Mostrara el nombre de la cancion que se esta reproduciendo*/
    void escucharCancion(String cancion);

}
