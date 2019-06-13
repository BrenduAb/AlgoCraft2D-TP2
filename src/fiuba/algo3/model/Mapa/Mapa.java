package fiuba.algo3.model.Mapa;

import fiuba.algo3.Excepciones.PosicionInvalidaException;
import fiuba.algo3.model.Contratos.IOcupable;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    private static Mapa instancia = null;
    private Map<Posicion, Celda> mapa = null;

    private int ancho = 12;
    private int alto = 8;

    private Mapa() {
        this.mapa = new HashMap<Posicion, Celda>();
        for (int i = 0; i < this.ancho; i++) {
            for (int j = 0; j < this.alto; j++) {
                Posicion p = new Posicion(i, j);
                Celda c = new Celda();
                mapa.put(p, c);
            }
        }
    }

    public static Mapa getInstance() {
        if (instancia == null) {
            instancia = new Mapa();
        }
        return instancia;
    }

    public void ocuparTerreno(Posicion posicion, IOcupable nuevoOcupable){
        Celda celda = this.mapa.get(posicion);

        if(celda == null){
            throw new PosicionInvalidaException();
        }

        celda.ocupar(nuevoOcupable);
        nuevoOcupable.definirPosicion(posicion);
    }
    public  void  liberarTerreno(Posicion posicion){
        this.mapa.get(posicion).liberarCelda();
    }

    public Celda obtenerCelda(Posicion posicion){
        return this.mapa.get(posicion);
    }

    public void moverOcupable(IOcupable ocupable, Posicion nuevoPosicion){
        Posicion posicionActual = ocupable.obtenerPosicion();
        this.ocuparTerreno(nuevoPosicion, ocupable);
        this.liberarTerreno(posicionActual);
    }
}
