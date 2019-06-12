package fiuba.algo3.model.Contratos;

import fiuba.algo3.model.Mapa.Posicion;

public interface IOcupable {
    public void definirPosicion(Posicion nuevaPosicion);

    public Posicion obtenerPosicion();
}
