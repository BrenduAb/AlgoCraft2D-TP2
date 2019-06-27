package fiuba.algo3.controller;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonEquiparEventHandler implements EventHandler<ActionEvent> {

    BotoneraInventarioViewModel botonera;
    Herramienta herramienta;
    Jugador jugador;
    VistaInventario vistaInventario;

    public BotonEquiparEventHandler(BotoneraInventarioViewModel botonera, Herramienta herramienta,
                                    VistaInventario vista) {
        this.botonera = botonera;
        this.jugador = vista.obtenerJuego().obtenerJugador();
        this.herramienta = herramienta;
        this.vistaInventario = vista;
    }

    @Override
    public void handle(ActionEvent event) {
        this.jugador.equipar(herramienta);
        this.botonera.botonEquipar.setDisable(true);
        this.vistaInventario.actualizar();
    }
}
