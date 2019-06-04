package fiuba.algo3.model;

import fiuba.algo3.Contratos.IGuardable;
import fiuba.algo3.Contratos.IHerramienta;

import javax.swing.*;
import java.awt.*;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Inventario {
    ArrayList<IGuardable> objetosDelInventario;
    IHerramienta herramientaSeleccionada;

    public Inventario(){
        objetosDelInventario = new ArrayList<IGuardable>();
        herramientaSeleccionada = null;
    }

    public void agregarAlInventario(IGuardable nuevoObjeto){
        objetosDelInventario.add(nuevoObjeto);
    }

    public int obtenerCantidadDeObjetos(){
        return objetosDelInventario.size();
    }

    public void cambiarHerramienta(IHerramienta nuevaHerramienta){
        herramientaSeleccionada = nuevaHerramienta;
    }

    public IHerramienta herramientaSeleccionada(){
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);
        return hacha;
    }
}
