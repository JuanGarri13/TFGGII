package tfggii.configuracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventoConfig {
    private String id;
    private boolean activo;
    private String variable_A;
    private String condicion;
    private String variable_B;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getVariable_A() {
		return variable_A;
	}
	public void setVariable_A(String variable_A) {
		this.variable_A = variable_A;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public String getVariable_B() {
		return variable_B;
	}
	public void setVariable_B(String variable_B) {
		this.variable_B = variable_B;
	}

}