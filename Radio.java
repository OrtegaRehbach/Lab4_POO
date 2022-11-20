import java.util.ArrayList;

public class Radio implements IRadioClaseB {

    // Funcionalidad basica
    private boolean encendida;
    private String modo;
    // Modo Radio
    private String banda;
    private double frecuenciaActual;
    private ArrayList<Double> emisorasGuardadas;
    private static int maxEmisoras = 50;
    // Modo Reproduccion
    private Playlist[] playlists;
    private static int maxPlaylists = 10;
    private Playlist playlistActual;
    private Cancion cancionActual;
    private int indiceCancionActual;
    // Modo Telefono
    private boolean telefonoConectado;
    private Contacto[] contactos;
    private int maxContactos = 10;
    private boolean enLlamada;
    private Contacto contactoEnLlamada;
    private int indiceContactoEnLlamada;
    private Contacto ultimoContacto;
    private int indiceUltimoContacto;
    // Modo Productividad
    private String[] tarjetasPresentacion;
    private int maxTarjetasPresentacion = 5;
    // Para formato de datos
    private static String divisor = "----------------------------------------------";

    public Radio() {
        encendida = true;
        modo = "Radio";
        banda = "AM";
        frecuenciaActual = 99.0;
        emisorasGuardadas = new ArrayList<Double>(maxEmisoras);
        playlists = new Playlist[maxPlaylists];
        playlistActual = null;
        cancionActual = null;
        telefonoConectado  = true;
        contactos = new Contacto[maxContactos];
        enLlamada = false;
        contactoEnLlamada = null;
        ultimoContacto = null;
        tarjetasPresentacion = new String[maxTarjetasPresentacion];
    }

    public Radio(Playlist[] playlists, Contacto[] contactos, String[] tarjetasPresentacion) {
        encendida = true;
        modo = "Radio";
        banda = "AM";
        frecuenciaActual = 50.0;
        emisorasGuardadas = new ArrayList<Double>(maxEmisoras);
        this.playlists = playlists;
        playlistActual = null;
        cancionActual = null;
        telefonoConectado  = false;
        this.contactos = contactos;
        enLlamada = false;
        contactoEnLlamada = null;
        ultimoContacto = null;
        this.tarjetasPresentacion = tarjetasPresentacion;
    }

    // Funcionalidad basica
    @Override
    public boolean encender() {
        encendida = true;
        return encendida ? false : true;
    }

    @Override
    public boolean apagar() {
        encendida = false;
        return encendida ? true : false;
    }

    @Override
    public boolean encendida() {
        return this.encendida;
    }

    @Override
    public boolean cambiarAModoRadio() {
        return cambiarAModo("Radio");
    }

    @Override
    public boolean cambiarAModoReproduccion() {
        return cambiarAModo("Reproduccion");
    }

    @Override
    public boolean cambiarAModoTelefono() {
        return cambiarAModo("Telefono");
    }

    @Override
    public boolean cambiarAModoProductividad() {
        return cambiarAModo("Productividad");
    }

    private boolean cambiarAModo(String modo) {
        if (!this.modo.equals(modo)) {
            this.modo = modo;
            return true;
        } else {
            return false;
        }
    }

    // Modo Radio
    @Override
    public void toggleAmFm() {
        if (banda.equals("AM")) {
            banda = "FM";
        } else {
            banda = "AM";
        }
    }

    @Override
    public boolean cambiarEmisora(boolean aumentar) {
        if (aumentar) {
            return aumentarFrecuencia();
        } else {
            return reducirFrecuencia();
        }
    }

    private boolean aumentarFrecuencia() {
        frecuenciaActual += 0.5;
        if (frecuenciaEnRango()) {
            return true;
        } else {
            frecuenciaActual = 100;
            return false;
        }
    }

    private boolean reducirFrecuencia() {
        frecuenciaActual -= 0.5;
        if (frecuenciaEnRango()) {
            return true;
        } else {
            frecuenciaActual = 0;
            return false;
        }
    }

    private boolean frecuenciaEnRango() {
        return (frecuenciaActual >= 0 && frecuenciaActual <= 100);
    }

    @Override
    public boolean guardarEmisora(double emisora) {
        if (emisorasGuardadas.size() < maxEmisoras) {
            emisorasGuardadas.add(emisora);
            return true;
        } else {
            return false;
        }
    }

    private boolean esFrecuenciaGuardada(double frecuencia) {
        for (Double frecu : emisorasGuardadas) {
            if (frecu == frecuencia)
                return true;
        }
        return false;
    }

    @Override
    public boolean cargarEmisora(int indiceEmisora) {
        if (indiceEmisora >= 0 && indiceEmisora < emisorasGuardadas.size()) {
            frecuenciaActual = emisorasGuardadas.get(indiceEmisora);
            return true;
        } else {
            return false;
        }
    }

    // Modo Reproduccion
    @Override
    public String mostrarPlaylists() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (Playlist playlist : playlists) {
            stringBuilder.append(count + ". " + playlist.getPlaylistString());
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    @Override
    public boolean seleccionarPlaylist(int indicePlaylist) {
        if (indicePlaylist >= 0 && indicePlaylist < playlists.length) {
            playlistActual = playlists[indicePlaylist];
            cancionActual = playlists[indicePlaylist].getCancion(0);
            indiceCancionActual = 0;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean cambiarCancion(boolean adelante) {
        if (playlistActual != null) {
            if (adelante) {
                int siguienteIndice = indiceCancionActual + 1;
                if (siguienteIndice > playlistActual.getCantidadCanciones()) {
                    siguienteIndice = 0;
                    cancionActual = playlistActual.getCancion(siguienteIndice);
                    indiceCancionActual = siguienteIndice;
                } else {
                    cancionActual = playlistActual.getCancion(siguienteIndice);
                    indiceCancionActual = siguienteIndice;
                }
            } else {
                int siguienteIndice = indiceCancionActual - 1;
                if (siguienteIndice < 0) {
                    siguienteIndice = playlistActual.getCantidadCanciones() - 1;
                    cancionActual = playlistActual.getCancion(siguienteIndice);
                    indiceCancionActual = siguienteIndice;
                } else {
                    cancionActual = playlistActual.getCancion(siguienteIndice);
                    indiceCancionActual = siguienteIndice;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String escucharCancion() {
        return (
            "Escuchando..." + "\n" + 
            divisor + "\n" + 
            cancionActual.getCancionString()
        );
    }

    // Modo Telefono
    @Override
    public boolean conectarTelefono() {
        if (!telefonoConectado) {
            telefonoConectado = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean desconectarTelefono() {
        if (telefonoConectado) {
            telefonoConectado = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String mostrarContactos() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#  Nombre:" + "\t" + "Numero:" + "\n");
        stringBuilder.append(divisor);
        int count = 1;
        for (Contacto contacto : contactos) {
            stringBuilder.append("\n");
            stringBuilder.append(count + ". " + contacto.getContactoString());
            count++;
        }
        return stringBuilder.toString();
    }

    @Override
    public String llamarAContacto(int indiceContacto) {
        if (!enLlamada) {
            contactoEnLlamada = contactos[indiceContacto];
            indiceContactoEnLlamada = indiceContacto;
            enLlamada = true;
            return "Llamando a \"" + contactoEnLlamada.getNombre() + "\"";
        } else {
            return "Ya hay una llamada en progreso";
        }
    }

    @Override
    public boolean finalizarLlamada() {
        if (enLlamada) {
            enLlamada = false;
            ultimoContacto = contactoEnLlamada;
            indiceUltimoContacto = indiceContactoEnLlamada;
            contactoEnLlamada = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean estaEnllamada() {
        return this.enLlamada;
    }

    @Override
    public String llamarUltimoContacto() {
        if (ultimoContacto != null) {
            return llamarAContacto(indiceUltimoContacto);
        } else {
            return "No se han realizado llamadas";
        }
    }

    // Modo Productividad
    @Override
    public String verTarjetasDePresentacion() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (String tarjeta : tarjetasPresentacion) {
            stringBuilder.append(count + ". " + tarjeta + "\n");
            count++;
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    @Override
    public String getEstado() {
        String encendidaString = (encendida) ? "Encendida" : "Apagada";
        String frecuenciaGuardada = esFrecuenciaGuardada(frecuenciaActual) ? "Si" : "No";
        String playlistSeleccionada = (playlistActual != null) ? playlistActual.getNombre() : "Ninguna";
        String tituloEstado = (
            "Estado del Radio:" + "\n" + 
            divisor + "\n" + 
            encendidaString + "\t" + "Modo: " + modo + "\n" + 
            divisor
        );
        if (!encendida)
            return tituloEstado;

        switch (modo) {
            case "Radio":
                return (
                    tituloEstado + "\n" + 
                    "Banda: " + banda + "\t" + "Frecuencia: " + frecuenciaActual + "\n" + 
                    "Frecuencia guardada: " + frecuenciaGuardada + "\n" + 
                    divisor
                );
                
            case "Reproduccion":
                if (playlistActual != null) {
                    return (
                        tituloEstado + "\n" + 
                        "Playlist seleccionada: " + playlistSeleccionada + "\n" + 
                        "Cancion actual: " + cancionActual.getTituloString() + "\n" + 
                        divisor
                    );
                } else {
                    return (
                        tituloEstado + "\n" + 
                        "Playlist seleccionada: " + playlistSeleccionada + "\n" + 
                        "Cancion actual: Ninguna" + "\n" + 
                        divisor
                    );
                }

            case "Telefono":
                return "Estado modo Telefono";
                
            case "Productividad":
                return "Estado modo Productividad";
        
            default:
                return "Modo no reconocido";

        }
    }

    // Gets
    @Override
    public String getModo() {
        return this.modo;
    }

    @Override
    public double getFrecuencia() {
        return this.frecuenciaActual;
    }

    public static String getDivisor() {
        return divisor;
    }

    @Override
    public String toString() {
        return "{" +
            " encendida='" + encendida + "'" +
            ", modo='" + modo + "'" +
            ", banda='" + banda + "'" +
            ", frecuenciaActual='" + frecuenciaActual + "'" +
            ", emisorasGuardadas='" + emisorasGuardadas + "'" +
            ", playlists='" + playlists + "'" +
            "}";
    }

    
}
