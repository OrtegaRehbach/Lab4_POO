// Universidad del Valle de Guatemala
// Programación Orientada a ObjetoS, Sección 20
// Ludwing Cano
// Adrian Recinos, Alejandro Ortega, Fernando Echeverria
public class Playlist {
    private String nombre;
    private Cancion[] canciones;

    public Playlist(String nombre, Cancion[] canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cancion[] getCanciones() {
        return this.canciones;
    }

    public int getCantidadCanciones() {
        return this.canciones.length;
    }

    public Cancion getCancion(int indiceCancion) {
        return this.canciones[indiceCancion];
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public String getPlaylistString() {
        return (nombre + "\t" + "Canciones: " + getCantidadCanciones());
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", canciones='" + getCanciones() + "'" +
            "}";
    }

}
