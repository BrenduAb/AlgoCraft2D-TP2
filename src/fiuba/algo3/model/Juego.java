package fiuba.algo3.model;

import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;

public class Juego {

    private Jugador jugador;

    public Juego(){
        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(3,3);

        Jugador jugador = new Jugador(posicionJugador,mapa);

        this.jugador = jugador;
    }

    public Jugador obtenerJugador(){
        return this.jugador;
    }
}
