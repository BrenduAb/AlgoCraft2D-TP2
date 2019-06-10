package fiuba.algo3.model.Mapa;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.model.Contratos.IOcupable;

public class Celda {
    IOcupable ocupable = null;

    public void ocupar(IOcupable nuevoOcupable){
        if(ocupable != null){
            throw new CeldaOcupadaException();
        }

        this.ocupable = nuevoOcupable;
    }

    public void liberarCelda(){
        this.ocupable = null;
    }

    public IOcupable obtenerElemento(){
        return this.ocupable;
    }
}
