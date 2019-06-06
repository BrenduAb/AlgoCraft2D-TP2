package fiuba.algo3.model.Jugador;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.IGuardable;

public class Jugador {
    Inventario inventario = new Inventario();

    public Jugador(){
        IGuardable hachaMadera = ConstructorHerramientas.construirPicoDeMadera();
        this.inventario.agregarAlInventario(hachaMadera);
    }

    public int obtenerCantidadDeObjetosDelInventario() {
        return this.inventario.obtenerCantidadDeObjetos();
    }
}
