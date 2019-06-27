package fiuba.algo3.controller;

import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonPonerEnHandler implements EventHandler<ActionEvent> {
    BotoneraInventarioViewModel botonera;
    Material material;
    Inventario inventario;
    VistaInventario vistaInventario;
    MesaDeCrafteo mesa;

    public BotonPonerEnHandler(BotoneraInventarioViewModel botonera, Material material,
                               VistaInventario vista) {
        this.botonera = botonera;
        this.inventario = vista.obtenerJuego().obtenerJugador().obtenerInventario();
        this.material = material;
        this.vistaInventario = vista;
        this.mesa = vista.obtenerJuego().obtenerMesaDeCrafteo();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        int posicionX = (int) botonera.columnaPonerMesa.getValue();
        int posicionY = (int) botonera.filaPonerMesa.getValue();
        Posicion posicion = new Posicion(posicionX - 1, posicionY - 1);
        this.inventario.removerGuardable(material);
        this.mesa.agregarMaterial(posicion, material);
        this.botonera.botonPonerEn.setDisable(true);
        this.vistaInventario.actualizar();
    }
}
