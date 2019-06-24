package fiuba.algo3.controller;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConstruirHerramientaEventHandler implements EventHandler<ActionEvent> {

    VistaInventario vistaInventario;
    MesaDeCrafteo mesaDeCrafteo;
    Jugador jugador;

    public ConstruirHerramientaEventHandler(VistaInventario vistaInventario,
                                            MesaDeCrafteo mesaDeCrafteo,
                                            Jugador jugador) {
        this.jugador = jugador;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(ActionEvent event) {
        Herramienta herramienta = this.mesaDeCrafteo.crear();
        if (herramienta == null) {
            this.vistaInventario.ponerMensajeError("No se pudo construir ninguna herramienta");
        } else {
            jugador.obtenerInventario().agregarAlInventario(herramienta);
            mesaDeCrafteo.limpiar();
            this.vistaInventario.actualizar(this.jugador.obtenerInventario());
        }
    }
}
