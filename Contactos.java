// Universidad del Valle de Guatemala
// Programación Orientada a ObjetoS, Sección 20
// Ludwing Cano
// Adrian Recinos, Alejandro Ortega, Fernando Echeverria
public class Contactos {
    String Nombre;
    String Numero;

    public Contactos(String nombre, String numero) {
        Nombre = nombre;
        Numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNumero() {
        return Numero;
    }
    
    public void setNumero(String numero) {
        Numero = numero;
    }

}


