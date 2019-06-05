package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;

public class Madera extends Material {

    public  Madera(){
        this.durabilidad = 10;
    }

    @Override
    public void chocarContra(Hacha hacha, Madera materialARecolectar) {
        int fuerza = 2;
        hacha.desgastar(fuerza);
        materialARecolectar.desgastar(fuerza);
    }

    @Override
    public void chocarContra(Hacha hacha, Piedra materialARecolectar) {
        int fuerza = 5;
        hacha.desgastar(fuerza);
        //No se desgasta el material
        //por que el hacha de madera no
        //le hace daño a la piedra
    }

    @Override
    public void chocarContra(Hacha hacha, Metal metal) {
        
    }

    @Override
    public void chocarContra(Pico pico, Madera Madera) {

    }

    @Override
    public void chocarContra(Pico pico, Piedra piedra) {

    }

    @Override
    public void chocarContra(Pico pico, Metal metal) {

    }

}
