package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;

public class CrafteoPicoMetal extends CrafteoHerramientas {

    public CrafteoPicoMetal(){

        crafteo.put(new Posicion(0,0), new Metal());
        crafteo.put(new Posicion(1,0), new Metal());
        crafteo.put(new Posicion(2,0), new Metal());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());

    }

    public Herramienta crearHerramienta(){
        return constructor.construirPicoDeMetal();
    }


}
