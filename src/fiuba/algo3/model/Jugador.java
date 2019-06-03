package fiuba.algo3.model;

import fiuba.algo3.Contratos.IGuardable;
import fiuba.algo3.Contratos.IHerramienta;

public class Jugador {

    Inventario inventario;
    public Jugador() {
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);
        inventario = new Inventario();
        inventario.agregarAlInventario(hacha);
    }


    public void guardarEnInventario(IGuardable elemento){
        inventario.agregarAlInventario(elemento);
    }

    public int obtenerCantidadDeObjetosDelInventario(){
        return inventario.obtenerCantidadDeObjetos();
    }

    public IHerramienta herramientaSeleccionada(){
        return inventario.herramientaSeleccionada();
    }

}
