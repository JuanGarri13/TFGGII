package tfggii.configuracion;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NodoCondicion {
    private String tipo;    
    private String operador;  
    private String referencia; 
    private List<NodoCondicion> sub_condiciones;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public List<NodoCondicion> getSub_condiciones() {
		return sub_condiciones;
	}
	public void setSub_condiciones(List<NodoCondicion> sub_condiciones) {
		this.sub_condiciones = sub_condiciones;
	}

}