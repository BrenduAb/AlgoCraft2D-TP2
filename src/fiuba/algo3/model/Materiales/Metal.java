package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpe;

public class Metal extends Material
{
    public Metal(){
        this.durabilidad = 50;
    }

    @Override
    public void golpear(Golpe golpe) {
        golpe.golpear(this);
    }
}
