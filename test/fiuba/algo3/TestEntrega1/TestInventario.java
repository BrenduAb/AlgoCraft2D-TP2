package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import org.junit.Assert;
import org.junit.Test;

public class TestInventario {
    @Test
    public void SeCreaInventarioSinElementos(){
        Inventario inventario = new Inventario();
        Assert.assertEquals(0, inventario.obtenerCantidadDeObjetos());
    }

    @Test
    public void SeAgregaUnElementoYLaCantidadDeObjetosEnElInventarioSeIncrementaUnaUnidad(){
        Inventario inventario = new Inventario();

        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        inventario.agregarAlInventario(pico);
        Assert.assertEquals(1, inventario.obtenerCantidadDeObjetos());
    }
}
