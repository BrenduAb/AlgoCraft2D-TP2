package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;


public class CrafteoPicoFino extends CrafteoHerramientas {

    public CrafteoPicoFino(){

        crafteo.put(new Posicion(0,0), new Metal());
        crafteo.put(new Posicion(1,0), new Metal());
        crafteo.put(new Posicion(2,0), new Metal());
        crafteo.put(new Posicion(0,1), new Piedra());
        crafteo.put(new Posicion(1,1), new Madera());
        crafteo.put(new Posicion(1,2), new Madera());
    }

    @Override
    public Herramienta crearHerramienta() {
        return constructor.construirPicoFino();
    }
}
