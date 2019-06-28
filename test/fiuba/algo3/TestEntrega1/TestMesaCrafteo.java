package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.PosicionOcupadaException;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;
import fiuba.algo3.model.MesaDeCrafteo.CrafteadorHerramientas;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestMesaCrafteo {

    @Test
    public void creoUnHachaDeMaderaEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Madera());
        crafteo.put(new Posicion(0,1), new Madera());
        crafteo.put(new Posicion(1,0), new Madera());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());
        Herramienta hacha = crafteador.crear(crafteo);

        Assert.assertEquals(true,hacha != null);
    }

    @Test
    public void creoUnHachaDeMetalEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Metal());
        crafteo.put(new Posicion(0,1), new Metal());
        crafteo.put(new Posicion(1,0), new Metal());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(2,1), new Madera());
        Herramienta hacha = crafteador.crear(crafteo);

        Assert.assertEquals(true,hacha != null);
    }

    @Test
    public void creoUnHachaDePiedraEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Piedra());
        crafteo.put(new Posicion(0,1), new Piedra());
        crafteo.put(new Posicion(1,0), new Piedra());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(2,1), new Madera());
        Herramienta hacha = crafteador.crear(crafteo);

        Assert.assertEquals(true,hacha != null);
    }

    @Test
    public void creoUnPicoFinoEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Metal());
        crafteo.put(new Posicion(1,0), new Metal());
        crafteo.put(new Posicion(2,0), new Metal());
        crafteo.put(new Posicion(0,1), new Piedra());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());
        Herramienta pico = crafteador.crear(crafteo);

        Assert.assertEquals(true,pico != null);
    }

    @Test
    public void creoUnPicoDeMaderaEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Madera());
        crafteo.put(new Posicion(1,0), new Madera());
        crafteo.put(new Posicion(2,0), new Madera());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());
        Herramienta pico = crafteador.crear(crafteo);

        Assert.assertEquals(true,pico != null);
    }

    @Test
    public void creoUnPicoDeMetalEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Metal());
        crafteo.put(new Posicion(1,0), new Metal());
        crafteo.put(new Posicion(2,0), new Metal());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());
        Herramienta pico = crafteador.crear(crafteo);

        Assert.assertEquals(true, pico != null);
    }

    @Test
    public void creoUnPicoDePiedraEnLaMesaDeCrafteo(){
        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();
        CrafteadorHerramientas crafteador = new CrafteadorHerramientas();
        crafteo.put(new Posicion(0,0), new Piedra());
        crafteo.put(new Posicion(1,0), new Piedra());
        crafteo.put(new Posicion(2,0), new Piedra());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());
        Herramienta pico = crafteador.crear(crafteo);

        Assert.assertEquals(true,pico != null);
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

    @Test
    public void seAgregaUnMaterialYObtieneCorrectamente(){
        CrafteadorHerramientas crafter = new CrafteadorHerramientas();
        MesaDeCrafteo mesa = new MesaDeCrafteo(crafter);

        Madera madera = new Madera();
        mesa.agregarMaterial(new Posicion(0, 0), madera);
        Material material = mesa.obtenerMaterial(new Posicion(0, 0));

        Assert.assertEquals(madera, material);
    }

    @Test
    public void seAgregaUnMaterialRemueveYObtieneCorrectamente(){
        CrafteadorHerramientas crafter = new CrafteadorHerramientas();
        MesaDeCrafteo mesa = new MesaDeCrafteo(crafter);

        mesa.agregarMaterial(new Posicion(0, 0), new Madera());
        mesa.removerMaterial(new Posicion(0, 0));
        Material material = mesa.obtenerMaterial(new Posicion(0, 0));

        Assert.assertEquals(true, material == null);
    }

    @Test
    public void seCreaUnaHerramientaDesdeLaMesaDeCrafteo(){
        CrafteadorHerramientas crafter = new CrafteadorHerramientas();
        MesaDeCrafteo mesa = new MesaDeCrafteo(crafter);

        HashMap<Posicion, Material> crafteo = new HashMap<Posicion, Material>();

        crafteo.put(new Posicion(0,0), new Madera());
        crafteo.put(new Posicion(0,1), new Madera());
        crafteo.put(new Posicion(1,0), new Madera());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());


        mesa.agregarMaterial(new Posicion(0, 0), new Madera());
        mesa.agregarMaterial(new Posicion(0, 1), new Madera());
        mesa.agregarMaterial(new Posicion(1, 0), new Madera());
        mesa.agregarMaterial(new Posicion(1, 1), new Madera());
        mesa.agregarMaterial(new Posicion(1, 2), new Madera());

        Herramienta hacha = mesa.crear();

        Assert.assertEquals(crafter.crear(crafteo).getClass(), hacha.getClass());
    }

    @Test
    public void seLimpiaCorrectamenteLaMesa(){
        CrafteadorHerramientas crafter = new CrafteadorHerramientas();
        MesaDeCrafteo mesa = new MesaDeCrafteo(crafter);

        mesa.agregarMaterial(new Posicion(0, 0), new Madera());
        mesa.agregarMaterial(new Posicion(0, 1), new Piedra());
        mesa.agregarMaterial(new Posicion(1, 0), new Metal());

        mesa.limpiar();

        Material material1 = mesa.obtenerMaterial(new Posicion(0, 0));
        Material material2 = mesa.obtenerMaterial(new Posicion(0, 1));
        Material material3 = mesa.obtenerMaterial(new Posicion(1, 0));
        Assert.assertEquals(true, ((material1 == null) && (material2 == null) &&(material3 == null)));
    }

    @Test(expected = PosicionOcupadaException.class)
    public void seAgregaOtroMaterialEnLaPosicionDondeYaHabiaYTiraPosicionOcupadaException() {
        CrafteadorHerramientas crafter = new CrafteadorHerramientas();
        MesaDeCrafteo mesa = new MesaDeCrafteo(crafter);

        Madera madera1 = new Madera();
        Madera madera2 = new Madera();

        mesa.agregarMaterial(new Posicion(0, 0), madera1);
        mesa.agregarMaterial(new Posicion(0, 0), madera2);
    }
}
