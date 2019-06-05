package fiuba.algo3.model.Herramientas;

import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Piedra;

public class Pico extends Herramienta {
    public Pico(Madera material){
        this.material = material;
        this.durabilidad = 100;
    }

    public Pico(Piedra material){
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
