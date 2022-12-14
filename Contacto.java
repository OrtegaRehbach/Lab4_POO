// Universidad del Valle de Guatemala
// Programación Orientada a ObjetoS, Sección 20
// Ludwing Cano
// Adrian Recinos, Alejandro Ortega, Fernando Echeverria
public class Contacto {
    private String nombre;
    private long numero;

    public Contacto(String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getContactoString() {
        return nombre + "\t" + numero;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }

}