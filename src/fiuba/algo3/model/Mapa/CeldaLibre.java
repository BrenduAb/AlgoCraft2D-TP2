package fiuba.algo3.model.Mapa;

import fiuba.algo3.model.Contratos.IOcupable;

public class CeldaLibre extends EstadoCelda {
    public CeldaLibre(IOcupable ocupable) {
        super(ocupable);
    }

    @Override
    public IOcupable obtenerElemento() {
        return null;
    }

    @Override
    public EstadoCelda ocupar(IOcupable nuevoOcupable) {
        return new CeldaOcupada(nuevoOcupable);
    }
}
