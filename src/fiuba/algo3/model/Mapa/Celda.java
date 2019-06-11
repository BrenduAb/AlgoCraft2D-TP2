package fiuba.algo3.model.Mapa;

import fiuba.algo3.model.Contratos.IOcupable;

public class Celda {

    EstadoCelda estadoCelda = new CeldaLibre(null);

    public void ocupar(IOcupable nuevoOcupable) {
        this.estadoCelda = this.estadoCelda.ocupar(nuevoOcupable);
    }

    public void liberarCelda() {
        this.estadoCelda = new CeldaLibre(null);
    }

    public IOcupable obtenerElemento() {
        return this.estadoCelda.obtenerElemento();
    }
}
