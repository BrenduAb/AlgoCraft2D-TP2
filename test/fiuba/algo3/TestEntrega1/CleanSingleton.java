package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Mapa.Mapa;

import java.lang.reflect.Field;

public class CleanSingleton {
    public static void cleanMapa(){
        try {
            Field field = Mapa.class.getDeclaredField("instancia");
            field.setAccessible(true);
            field.set(null, null);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
