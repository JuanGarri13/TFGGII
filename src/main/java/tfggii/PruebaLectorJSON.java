package tfggii;

import tfggii.configuracion.EstrategiaConfig;
import tfggii.configuracion.IndicadorConfig;
import tfggii.configuracion.EventoConfig;
import tfggii.configuracion.ReglaConfig;
import tfggii.configuracion.LectorJSON;

public class PruebaLectorJSON {

    public static void main(String[] args) throws Exception {
        
        EstrategiaConfig config = LectorJSON.cargarEstrategia("src/main/resources/estrategia/plantilla.json");

        System.out.println("Estrategia cargada: " + config.getEstrategia_nombre());

        for (IndicadorConfig ind : config.getIndicadores()) {
            System.out.println("Indicador: " + ind.getId() + " - " + ind.getTipo());
        }

        if (config.getEventos() != null) {
            for (EventoConfig evt : config.getEventos()) {
                System.out.println("Evento: " + evt.getId() + " -> " + evt.getCondicion());
            }
        }

        if (config.getReglas() != null) {
            for (ReglaConfig regla : config.getReglas()) {
                System.out.println("Regla: " + regla.getId() + " -> " + regla.getAccion());
            }
        }
    }
}