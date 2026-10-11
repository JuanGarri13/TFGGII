package tfggii.configuracion;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicadorConfig {
    private String id;
    private String tipo;
    private Map<String, Double> parametros; 
    private boolean activo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Map<String, Double> getParametros() {
		return parametros;
	}
	public void setParametros(Map<String, Double> parametros) {
		this.parametros = parametros;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}


}