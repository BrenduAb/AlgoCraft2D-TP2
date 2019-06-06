package fiuba.algo3.model.Jugador;

import fiuba.algo3.model.IGuardable;
import fiuba.algo3.model.Materiales.Material;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<IGuardable> elementos = new ArrayList<IGuardable>();

    public int obtenerCantidadDeObjetos(){
     return elementos.size();
    }

    public void agregarAlInventario(IGuardable material){
        elementos.add(material);
    }
}
