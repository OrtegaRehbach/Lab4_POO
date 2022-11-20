public class Cancion {
    private String nombre;
    private String autor;
    private String duracion;
    private String genero;

    public Cancion(String nombre, String autor, String duracion, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTituloString() {
        return "\"" + nombre + "\" by: " + autor;
    }

    public String getCancionString() {
        return (
            "\"" + nombre + "\" by " + autor + "\t\t" + "Duracion: " + duracion + "\n" + 
            "Genero: " + genero
        );
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", autor='" + getAutor() + "'" +
            ", duracion='" + getDuracion() + "'" +
            ", genero='" + getGenero() + "'" +
            "}";
    }    

}
