package fiuba.algo3.model.Jugador;

import fiuba.algo3.model.IGuardable;
import fiuba.algo3.model.Materiales.Material;

public class Inventario {

    private int cantidadItems = 0;

    public int obtenerCantidadDeObjetos(){
     return cantidadItems;
    }

    public void agregarAlInventario(IGuardable material){
        cantidadItems += 1;
    }
}
