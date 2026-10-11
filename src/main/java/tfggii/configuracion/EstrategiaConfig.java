package tfggii.configuracion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstrategiaConfig {
    private String estrategia_nombre;
    private List<IndicadorConfig> indicadores;
    private List<EventoConfig> eventos;
    private List<ReglaConfig> reglas;
	public String getEstrategia_nombre() {
		return estrategia_nombre;
	}
	public void setEstrategia_nombre(String estrategia_nombre) {
		this.estrategia_nombre = estrategia_nombre;
	}
	public List<IndicadorConfig> getIndicadores() {
		return indicadores;
	}
	public void setIndicadores(List<IndicadorConfig> indicadores) {
		this.indicadores = indicadores;
	}
	public List<EventoConfig> getEventos() {
		return eventos;
	}
	public void setEventos(List<EventoConfig> eventos) {
		this.eventos = eventos;
	}
	public List<ReglaConfig> getReglas() {
		return reglas;
	}
	public void setReglas(List<ReglaConfig> reglas) {
		this.reglas = reglas;
	}

}