public class TarjetasDePresentacion {
    String Nombre;
    String Numero;
    String Direccion;
    String Oficio;

    public TarjetasDePresentacion(String nombre, String numero, String direccion, String oficio) {
        Nombre = nombre;
        Numero = numero;
        Direccion = direccion;
        Oficio = oficio;
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
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public String getOficio() {
        return Oficio;
    }
    public void setOficio(String oficio) {
        Oficio = oficio;
    }

}
