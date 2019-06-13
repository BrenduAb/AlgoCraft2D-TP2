package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.CrafteadorHerramientas;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestMesaCrafteo {

    @Test
    public void creoUnHachaDeMaderaEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0, 0), new Madera());
        crafteo.put(new Posicion(0, 1), new Madera());
        crafteo.put(new Posicion(1, 0), new Madera());
        crafteo.put(new Posicion(1, 1), new Madera());
        crafteo.put(new Posicion(2, 1), new Madera());
        Herramienta hacha = crafteador.crear(crafteo);

        Assert.assertEquals(true,hacha != null);
    }

    @Test
    public void pongoCualquierCosaEnLaMesaDeCrafteoYMeRetornaNull(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0, 0), new Madera());
        crafteo.put(new Posicion(0, 1), new Madera());
        crafteo.put(new Posicion(2, 1), new Madera());
        Herramienta hacha = crafteador.crear(crafteo);

        Assert.assertEquals(true,hacha == null);
    }
}
