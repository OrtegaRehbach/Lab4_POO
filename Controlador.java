import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controlador implements IRadio, IReproducir,ITelefono, IVistaRadio, IProductividad{
    Vista vista;
    
    Radio radio = new Radio(false, 0, "FM", 0.00, 0, 1, false, false, 0);
    Cancion Mastermind= new Cancion("Mastermind", "3:09", "Taylor Swift", "pop");
    Cancion Karma= new Cancion("Karma", "3:30", "Taylor Swift", "pop");
    Cancion How= new Cancion("How to Dissapear", "3:49", "Lana del Rey", "pop");
    Cancion Delincuente= new Cancion("Delincuente", "6:37", "Farruko, Anuel AA, Kendo Kapponi", "regueton");
    Cancion Bizcochito= new Cancion("Bizcochito", "1:50", "null", "pop, regueton");
    Cancion contesto= new Cancion("Si no le contesto", "5:06", "Plan b, Tony Dize, Zion y Lennox", "regueton");
    Cancion Bejeweled= new Cancion("Bejeweled", "5:54", "Taylor Swift", "pop");
    Cancion Question= new Cancion("Question...?", "3:31", "Taylor Swift", "pop");
    ListaReproduccion lista1= new ListaReproduccion("lista 1");
    ListaReproduccion lista2= new ListaReproduccion("lista 2");

    
    public Controlador(){
        radio.getListasDeReproduccion().add(lista1);
        radio.getListasDeReproduccion().add(lista2);
        radio.getListasDeReproduccion().get(0).getCanciones().add(Mastermind);
        radio.getListasDeReproduccion().get(0).getCanciones().add(Karma);
        radio.getListasDeReproduccion().get(0).getCanciones().add(How);
        radio.getListasDeReproduccion().get(0).getCanciones().add(Delincuente);
        radio.getListasDeReproduccion().get(1).getCanciones().add(Bizcochito);
        radio.getListasDeReproduccion().get(1).getCanciones().add(contesto);
        radio.getListasDeReproduccion().get(1).getCanciones().add(Bejeweled);
        radio.getListasDeReproduccion().get(1).getCanciones().add(Question);

        

    }

    @Override
    public void Encender() {
        // TODO Auto-generated method stub
        radio.setEstado();
        System.out.println("estado del radio: "+ radio.getEstado());

        
    }

    @Override
    public void Apagar() {
        // TODO Auto-generated method stub
        Encender();
        
    }

    public Boolean getEstadoRadio() {
        Boolean estado = radio.getEstado();
        return estado;
        
    }

    public void CambiarVolumen(int volumen) {
        radio.setVolumen(volumen);
        System.out.println("volumen actual: "+ radio.getVolumen() );

    }

    public void CambiarEmisora(int OPemisora) {
        Double emisora= radio.getEmisoras();
        if (OPemisora==1){
            emisora+=0.5;
            System.out.println("emisora: "+ emisora);
        }
        else if (OPemisora==2){
            emisora-=0.5;
            if (emisora<0.00){
                emisora=0.00;
                System.out.println("ya no se puede bajar más");
            }
        }
        
        radio.setEmisoras(emisora);

    }

    @Override
    public void conectarTelefono(){
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mostrarContactos(Array contactos) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void LlamarContacto(int contacto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void FinalizarLlamada() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void llamarUltimoContacto(int ultimoContacto) {
        // TODO Auto-generated method stub
        
    }

    public void SSeleccionarListaReproduccion(int nlista) {
        if (nlista==1){
            System.out.println("Se esta reproduciendo la primera Lista, con las canciones: ");
            radio.setNumeroLista(0);
            for (int i = 0; i < radio.getListasDeReproduccion().get(0).getCanciones().size(); i++){
                System.out.println(radio.getListasDeReproduccion().get(0).getCanciones().get(i).getNombre());
            }
        }else if (nlista==2){
            System.out.println("Se esta reproduciendo la segunda Lista, con las canciones: ");
            radio.setNumeroLista(1);
            for (int i = 0; i < radio.getListasDeReproduccion().get(1).getCanciones().size(); i++){
                System.out.println(radio.getListasDeReproduccion().get(1).getCanciones().get(i).getNombre());
            }

        }

    }

    @Override
    public void seleccionarListaReproduccion(ArrayList<String> canciones) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cambiarCancion(String Cancion) {
        // TODO Auto-generated method stub
        
    }

    public void CambiarCancion(int puntero) {
        int lista= radio.getNumeroLista();
        int CancionReproducida= radio.getCancion();
        System.out.println("CancionReproducida");
        int validar= CancionReproducida-1;
        System.out.println(validar);
        
        //System.out.println(radio.getListasDeReproduccion().get(lista).getCanciones().get(CancionReproducida).getAutor());

        if (puntero==1){
            if (validar>=0){
                radio.getListasDeReproduccion().get(lista).getCanciones().get(CancionReproducida-1);
                System.out.println(radio.getListasDeReproduccion().get(lista).getCanciones().get(CancionReproducida-1).getNombre());
                System.out.println("se cambio la cancion");
                radio.setCancion(CancionReproducida-1);
            }else{
                System.out.println("no se puede cambiar la cancion, porque no hay cancion anterior");
            }
            
            
            }else if (puntero==2){
            radio.setCancion(CancionReproducida+1);
            radio.getListasDeReproduccion().get(lista).getCanciones().get(CancionReproducida+1);
            System.out.println("se cambio la cancion");

        }
        
    }


    @Override
    public void escucharCancion(String cancion) {
        // TODO Auto-generated method stub
        
    }
    
    public void VerCanciones(){
        int lista= radio.getNumeroLista();
        int contador= -1;
        for (int i = 0; i < radio.getListasDeReproduccion().get(lista).getCanciones().size(); i++){
            contador++;
            System.out.println(contador+ ". "+radio.getListasDeReproduccion().get(lista).getCanciones().get(i).getNombre());
        }
    }
    public void EscucharCancion(int Ncancion) {

        int lista= radio.getNumeroLista();      
        radio.setCancion(Ncancion);
        String nombre=  radio.getListasDeReproduccion().get(lista).getCanciones().get(Ncancion).getNombre();
        String duracion=  radio.getListasDeReproduccion().get(lista).getCanciones().get(Ncancion).getDuracion();
        String genero=  radio.getListasDeReproduccion().get(lista).getCanciones().get(Ncancion).getGenero();
        String autor=  radio.getListasDeReproduccion().get(lista).getCanciones().get(Ncancion).getAutor();

        System.out.println("Nombre: "+ nombre + " duracion: " + duracion + " genero: "+ genero + " autor: "+ autor);
    }

    @Override
    public void IntercambiarBanda() {
        // TODO Auto-generated method stub
        radio.setBanda("AM");
        System.out.println("Banda actualizada a: "+ radio.getBanda());

        
    }

    @Override
    public void cambiarEmisora() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double guardarEmisora() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void GuardarEmisora() {
        Double emisora= radio.getEmisoras();
        radio.getListaEmisora().add(emisora);
        //System.out.println("Emisora guardada: "+ radio.getEmisoras());

        for (int i = 0; i < radio.getListaEmisora().size(); i++){
            System.out.println(radio.getListaEmisora().get(i));
        }

        
    }


    @Override
    public void cargarEmisora() {
        // TODO Auto-generated method stub
        
    }

    public void CargarEmisora(Double Emisora) {
        radio.setEmisoras(Emisora);
        System.out.println("se cargo la emisora: "+  radio.getEmisoras());
    }

    @Override
    public void verTarjetas(ArrayList<String> tarjetas) {
        // TODO Auto-generated method stub
        
    }
    
}
