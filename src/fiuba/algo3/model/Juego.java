package fiuba.algo3.model;

import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;

public class

Juego {

    private Jugador jugador = new Jugador();

    public Juego(){
        Mapa mapa = Mapa.getInstance();
        Jugador jugador = new Jugador();
        Posicion posicionJugador = new Posicion(3,3);

        mapa.ocuparTerreno(posicionJugador,jugador);

        this.jugador = jugador;
    }

    public Jugador obtenerJugador(){
        return this.jugador;
    }


}
