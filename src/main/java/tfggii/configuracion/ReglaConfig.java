package tfggii.configuracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReglaConfig {
    private String id;
    private boolean activo;
    private String accion;
    private String direccion;
    private RiesgoConfig riesgo;
    private NodoCondicion condicion_raiz;
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
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public RiesgoConfig getRiesgo() {
		return riesgo;
	}
	public void setRiesgo(RiesgoConfig riesgo) {
		this.riesgo = riesgo;
	}
	public NodoCondicion getCondicion_raiz() {
		return condicion_raiz;
	}
	public void setCondicion_raiz(NodoCondicion condicion_raiz) {
		this.condicion_raiz = condicion_raiz;
	}

}