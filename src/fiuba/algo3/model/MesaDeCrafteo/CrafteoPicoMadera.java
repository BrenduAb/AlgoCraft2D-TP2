package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;


public class CrafteoPicoMadera extends CrafteoHerramientas {

    public CrafteoPicoMadera(){

        crafteo.put(new Posicion(0,0), new Madera());
        crafteo.put(new Posicion(0,1), new Madera());
        crafteo.put(new Posicion(0,2), new Madera());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(2,1), new Madera());

    }

    @Override
    public Herramienta crearHerramienta() {
        return constructor.construirPicoDeMadera();
    }
}
