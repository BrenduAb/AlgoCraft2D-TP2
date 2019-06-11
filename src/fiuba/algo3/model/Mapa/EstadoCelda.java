package fiuba.algo3.model.Mapa;

import fiuba.algo3.model.Contratos.IOcupable;

public abstract class EstadoCelda {
    IOcupable ocupable = null;

    public EstadoCelda(IOcupable ocupable){
        this.ocupable = ocupable;
    }

    public abstract IOcupable obtenerElemento();

    public abstract EstadoCelda ocupar(IOcupable nuevoOcupable);
}
