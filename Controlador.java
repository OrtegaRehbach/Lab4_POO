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
    Contactos contacto_1= new Contactos("Keymer", "12345678");
    Contactos contacto_2= new Contactos("Jose Pablo", "87456321");
    Contactos contacto_3= new Contactos("Ludwing", "12547854");
    Contactos contacto_4= new Contactos("Douglas", "20545987");
    Contactos contacto_5= new Contactos("Elsa Patin", "50405055");
    TarjetasDePresentacion tarjeta_1= new TarjetasDePresentacion("Keymer", "12345678", "Universidad del Valle de Guatemala z.16", "Estudiante");
    TarjetasDePresentacion tarjeta_2= new TarjetasDePresentacion("Jose Pablo", "87456321", "Universidad del Valle de Guatemala z.16", "Catedratico");
    TarjetasDePresentacion tarjeta_3= new TarjetasDePresentacion("Ludwing", "12547854", "Universidad del Valle de Guatemala z.16", "Catedratico");
    TarjetasDePresentacion tarjeta_4= new TarjetasDePresentacion("Douglas", "20545987", "Universidad del Valle de Guatemala z.16", "Director de Carrera");



    
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
        radio.getContactos().add(contacto_1);
        radio.getContactos().add(contacto_2);
        radio.getContactos().add(contacto_3);
        radio.getContactos().add(contacto_4);
        radio.getContactos().add(contacto_5);
        radio.getTarjetas().add(tarjeta_1);
        radio.getTarjetas().add(tarjeta_2);
        radio.getTarjetas().add(tarjeta_3);
        radio.getTarjetas().add(tarjeta_4);



        

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
        radio.setEstadoTelefono();
        
    }

    @Override
    public void mostrarContactos(Array contactos) {
        // TODO Auto-generated method stub
        
    }

    public void mstrarContactos() {
        int c= 0;
        for (int i = 0; i < radio.getContactos().size(); i++){
            c++;
            System.out.println(c+". "+radio.getContactos().get(i).getNombre());
        }
    }

    @Override
    public void LlamarContacto(int contacto) {
        // TODO Auto-generated method stub
        if (radio.getEnLlamada()==false){
            radio.setEnLlamada(true);
            System.out.println("en llamada con: "+ radio.getContactos().get(contacto-1).getNombre());
            radio.getLlamadas().add(radio.getContactos().get(contacto-1));

        }else{
            System.out.println("ya se encuentra en llamada, no puede realizar otra");
        }
        
    }

    @Override
    public void FinalizarLlamada() {
        // TODO Auto-generated method stub
        radio.setEnLlamada(false);
        System.out.println("se termino la llamada");

        
    }

    @Override
    public void llamarUltimoContacto(int ultimoContacto) {
        // TODO Auto-generated method stub

        
    }

    public void LlamarUltimoContacto() {
        
        int tamanioLista= radio.getLlamadas().size();
        int posicion= tamanioLista-1;
        if (radio.getEnLlamada()==false){
            radio.setEnLlamada(true);
            System.out.println("en llamada con: "+ radio.getContactos().get(posicion).getNombre());
            radio.getLlamadas().add(radio.getContactos().get(posicion));

        }else{
            System.out.println("ya se encuentra en llamada, no puede realizar otra");
        }

        
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

    public void VerTarjetas() {
        // TODO Auto-generated method stub
        int c=0;
        for (int i = 0; i < radio.getTarjetas().size(); i++){
            c++;
            System.out.println("Tarjeta no. "+ c);
            System.out.println("Nombre: "+radio.getTarjetas().get(i).getNombre());
            System.out.println("Numero: "+radio.getTarjetas().get(i).getNumero());
            System.out.println("Direccion: "+radio.getTarjetas().get(i).getDireccion());
            System.out.println("Oficio: "+radio.getTarjetas().get(i).getOficio());
            System.out.println("");

        }
        
    }
    
}
