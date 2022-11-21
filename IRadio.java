// Universidad del Valle de Guatemala
// Programación Orientada a ObjetoS, Sección 20
// Ludwing Cano
// Adrian Recinos, Alejandro Ortega, Fernando Echeverria
public interface IRadio {
    /** Cambiar de FM a AM*/
    void IntercambiarBanda();

    /** Cambia la emisora actual */
    void cambiarEmisora();

    /** Guardara una nueva emisora en la lista de emisoras */
    double guardarEmisora();

    /* Se podrán cargar las 50 estaciones de radio que se hayan guardado*/
    void cargarEmisora();
}
