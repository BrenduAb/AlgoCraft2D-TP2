package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Hacha;
import fiuba.algo3.model.Inventario;
import fiuba.algo3.model.Madera;
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
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);

        inventario.agregarAlInventario(hacha);
        Assert.assertEquals(1, inventario.obtenerCantidadDeObjetos());
    }
}
