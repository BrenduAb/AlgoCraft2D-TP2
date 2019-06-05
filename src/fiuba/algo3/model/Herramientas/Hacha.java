package fiuba.algo3.model.Herramientas;

import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Piedra;

public class Hacha extends Herramienta {

    public Hacha(Madera material){
        this.material = material;
        this.durabilidad = 100;
    }
    public Hacha(Piedra material){
        this.material = material;
        this.durabilidad = 200;
    }

    @Override
    public void usarContra(Madera materialARecolectar) {
        material.chocarContra(this, materialARecolectar);
    }

    @Override
    public void usarContra(Piedra materialARecolectar) {
        material.chocarContra(this, materialARecolectar);
    }

    @Override
    public void desgastar(int danio) {
        durabilidad -= danio;
    }
}
