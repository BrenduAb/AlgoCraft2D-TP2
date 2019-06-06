package fiuba.algo3.model.Herramientas;
import fiuba.algo3.model.Durabilidad.*;
import fiuba.algo3.model.Golpe.*;

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

    public static Hacha construirHachaDeMadera(){
        Golpe golpeDeHacha = new GolpeHacha(2);
        Desgaste desgaste = new DesgasteRapido(100);
        Hacha hacha = new Hacha(desgaste,golpeDeHacha);
        return hacha;
    }

    public static Hacha construirHachaDePiedra(){
        Golpe golpeDeHacha = new GolpeHacha(5);
        Desgaste desgaste = new DesgasteRapido(200);
        Hacha hacha = new Hacha(desgaste,golpeDeHacha);
        return hacha;
    }

    public static Hacha construirHachaDeMetal(){
        Golpe golpeDeHacha = new GolpeHacha(10);
        Desgaste desgaste = new DesgasteLento(400);
        Hacha hacha = new Hacha(desgaste,golpeDeHacha);
        return hacha;
    }

    public static PicoFino construirPicoFino(){
        Golpe golpePicoFino = new GolpeHacha(20);
        Desgaste desgaste = new DesgasteMinimo(1000);
        PicoFino hacha = new PicoFino(desgaste,golpePicoFino);
        return hacha;
    }

}
