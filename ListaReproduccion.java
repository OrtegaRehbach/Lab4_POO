import java.util.ArrayList;
public class ListaReproduccion {
    String Lista;
    
    public ListaReproduccion(String lista) {
        Lista = lista;
    }
    ArrayList<Cancion> canciones = new ArrayList<>();
    
    public String getLista() {
        return Lista;
    }
    public void setLista(String lista) {
        Lista = lista;
    }
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
}
