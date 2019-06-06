package fiuba.algo3.model.Herramientas;

import fiuba.algo3.model.Durabilidad.Desgaste;
import fiuba.algo3.model.Durabilidad.DesgasteMedio;
import fiuba.algo3.model.Durabilidad.DesgasteRapido;
import fiuba.algo3.model.Golpe.Golpe;
import fiuba.algo3.model.Golpe.GolpePico;
import fiuba.algo3.model.Golpe.GolpePicoPiedra;

public class ConstructorHerramientas {
    public static Pico construirPicoDeMadera(){
        Golpe golpeDePico = new GolpePico(2);
        Desgaste desgaste = new DesgasteRapido(100);
        Pico pico = new Pico(desgaste,golpeDePico);
        return pico;
    }

    public static Pico construirPicoDePiedra(){
        Golpe golpeDePico = new GolpePicoPiedra(4);
        Desgaste desgaste = new DesgasteMedio(200);
        Pico pico = new Pico(desgaste,golpeDePico);
        return pico;
    }

    public static Pico construirPicoDeMetal(){
        Golpe golpeDePico = new GolpePico(12);
        Desgaste desgaste = new DesgasteMedio(400);
        Pico pico = new Pico(desgaste,golpeDePico);
        return pico;
    }
}
