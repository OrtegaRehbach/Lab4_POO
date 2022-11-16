public interface IRadioB {

    // Metodos funcionales
    public boolean encender();

    public boolean apagar();

    public boolean cambiarAModoRadio();

    public boolean cambiarAModoReproduccion();

    public boolean cambiarAModoTelefono();

    public boolean cambiarAModoProductividad();

    // Modo Radio
    public void toggleAmFm();

    public boolean cambiarEmisora(boolean aumentar);

    public boolean guardarEmisora(double emisora);

    public boolean cargarEmisora(double emisora);

    // Modo Reproduccion
    public boolean seleccionarPlaylist(int indicePlaylist);

    public boolean cambiarCancion(boolean adelante);

    public String escucharCancion();

    // Modo Telefono
    public boolean conectarTelefono();

    public boolean desconectarTelefono();

    public String mostrarContactos();

    public String llamarAContacto(int indiceContacto);

    public boolean finalizarLlamada();

    public String llamarUltimoContacto();   // Clase B

    // Modo Productividad
    public String verTarjetasDePresentacion();  // Clase B

    // Estado del Radio
    public String getEstado();

    // Gets
    public String getModo();

    public String getFrecuencia();
}