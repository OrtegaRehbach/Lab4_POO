public class Cancion {
    String Nombre;
    String Duracion;
    String Autor;
    String Genero;
    public Cancion(String nombre, String duracion, String autor, String genero) {
        Nombre = nombre;
        Duracion = duracion;
        Autor = autor;
        Genero = genero;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDuracion() {
        return Duracion;
    }
    public void setDuracion(String duracion) {
        Duracion = duracion;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
}
