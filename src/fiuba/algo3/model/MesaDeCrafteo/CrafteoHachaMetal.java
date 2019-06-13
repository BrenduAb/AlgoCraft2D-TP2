package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;

public class CrafteoHachaMetal extends CrafteoHerramientas{


    public CrafteoHachaMetal(){

        crafteo.put(new Posicion(0,0), new Metal());
        crafteo.put(new Posicion(0,1), new Metal());
        crafteo.put(new Posicion(1,0), new Metal());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(2,1), new Madera());

    }

    @Override
    public Herramienta crearHerramienta() {
        return constructor.construirHachaDeMetal();
    }
}
