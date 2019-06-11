package fiuba.algo3.model.Mapa;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.model.Contratos.IOcupable;

public class CeldaOcupada extends EstadoCelda {
    public CeldaOcupada(IOcupable ocupable) {
        super(ocupable);
    }

    @Override
    public IOcupable obtenerElemento() {
        return this.ocupable;
    }

    @Override
    public EstadoCelda ocupar(IOcupable nuevoOcupable) {
        throw new CeldaOcupadaException();
    }
}
