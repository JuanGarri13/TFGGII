package tfggii.configuracion;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class LectorJSON {
    public static EstrategiaConfig cargarEstrategia(String rutaArchivo) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(rutaArchivo), EstrategiaConfig.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al leer el JSON de estrategia", e);
        }
    }
}