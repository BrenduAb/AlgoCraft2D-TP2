package fiuba.algo3.model.Jugador;

import fiuba.algo3.model.Contratos.IGuardable;

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

    public IGuardable obtenerGuardable(int posicion){
        return elementos.get(posicion);
    }
}
