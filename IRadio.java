public interface IRadio {

    // Metodos funcionales
    public boolean encender();

    public boolean apagar();

    public boolean encendida();

    public boolean cambiarAModoRadio();

    public boolean cambiarAModoReproduccion();

    public boolean cambiarAModoTelefono();

    public boolean cambiarAModoProductividad();

    // Modo Radio
    public void toggleAmFm();

    public boolean cambiarEmisora(boolean aumentar);

    public boolean guardarEmisora(double emisora);

    public boolean cargarEmisora(int indiceEmisora);

    // Modo Reproduccion
    public String mostrarPlaylists();

    public boolean seleccionarPlaylist(int indicePlaylist);

    public boolean cambiarCancion(boolean adelante);

    public String escucharCancion();

    // Modo Telefono
    public boolean conectarTelefono();

    public boolean desconectarTelefono();

    public String mostrarContactos();

    public String llamarAContacto(int indiceContacto);

    public boolean finalizarLlamada();

    public boolean estaEnllamada();

    // Llamar al ultimo contacto con el que se hablo (Clase B)

    // Modo Productividad
    // Ver tarjetas de presentacion (Clase B)

    // Estado del Radio
    public String getEstado();

    // Gets
    public String getModo();

    public double getFrecuencia();
}