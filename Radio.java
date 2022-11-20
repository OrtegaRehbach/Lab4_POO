import java.util.ArrayList;

public class Radio {
    Boolean Estado;
    int Volumen;
    //modo radio
    String Banda;
    Double Emisoras;
    ArrayList<Double> ListaEmisora = new ArrayList<>();
    //modo reproduccion
    ArrayList<ListaReproduccion> ListasDeReproduccion = new ArrayList<>();
    
    ArrayList<Cancion> Canciones = new ArrayList<>();
    int NumeroLista=0;
    int Cancion;
    //modo telefono
    Boolean EstadoTelefono;
    ArrayList<String> Contactos = new ArrayList<>();
    Boolean EnLlamada;
    //
    int UltimoContacto;

    public Radio(Boolean estado, int volumen, String banda, Double emisoras, 
            int numeroLista, int cancion, Boolean estadoTelefono,
             Boolean enLlamada, int ultimoContacto) {
        Estado = estado;
        Volumen = volumen;
        Banda = banda;
        Emisoras = emisoras;
        NumeroLista = numeroLista;
        Cancion = cancion;
        EstadoTelefono = estadoTelefono;
        EnLlamada = enLlamada;
        UltimoContacto = ultimoContacto;
    }
    
    public ArrayList<ListaReproduccion> getListasDeReproduccion() {
        return ListasDeReproduccion;
    }

    public void setListasDeReproduccion(ArrayList<ListaReproduccion> listasDeReproduccion) {
        ListasDeReproduccion = listasDeReproduccion;
    }
    
    public Boolean getEstado() {
        return Estado;
    }
    public Boolean setEstado() {
        if (Estado==false){
            Estado= true;

        }else if (Estado== true){
            Estado= false;
        }
        return Estado;
    }
    public int getVolumen() {
        return Volumen;
    }
    public void setVolumen(int Vol) {
        if (Volumen>=0){
            if (Vol==1){
                Volumen++;

            }else if (Vol==2){
                Volumen--;
                if (Volumen<0){
                    Volumen=0;
                    System.out.println("no se puede bajar más volumen");
                }
            }
        }
    }
    public String getBanda() {
        return Banda;
    }
    public void setBanda(String banda) {
        Banda = banda;
    }
    public Double getEmisoras() {
        return Emisoras;
    }
    public void setEmisoras(Double emisoras) {
        Emisoras = emisoras;
    }
    public ArrayList<Double> getListaEmisora() {
        return ListaEmisora;
    }
    public void setListaEmisora(ArrayList<Double> listaEmisora) {
        ListaEmisora = listaEmisora;
    }
    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        Canciones = canciones;
    }
    public int getNumeroLista() {
        return NumeroLista;
    }
    public void setNumeroLista(int numeroLista) {
        NumeroLista = numeroLista;
    }
    public int getCancion() {
        return Cancion;
    }
    public void setCancion(int cancion) {
        Cancion = cancion;
    }
    public Boolean getEstadoTelefono() {
        return EstadoTelefono;
    }
    public void setEstadoTelefono(Boolean estadoTelefono) {
        EstadoTelefono = estadoTelefono;
    }
    public ArrayList<String> getContactos() {
        return Contactos;
    }
    public void setContactos(ArrayList<String> contactos) {
        Contactos = contactos;
    }
    public Boolean getEnLlamada() {
        return EnLlamada;
    }
    public void setEnLlamada(Boolean enLlamada) {
        EnLlamada = enLlamada;
    }
    public int getUltimoContacto() {
        return UltimoContacto;
    }
    public void setUltimoContacto(int ultimoContacto) {
        UltimoContacto = ultimoContacto;
    }



    
}
