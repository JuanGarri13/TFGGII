package tfggii.configuracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RiesgoConfig {
    private boolean activo;
    private double stop_loss_pct;
    private double take_profit_pct;
    private double trailing_stop_pct;
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public double getStop_loss_pct() {
		return stop_loss_pct;
	}
	public void setStop_loss_pct(double stop_loss_pct) {
		this.stop_loss_pct = stop_loss_pct;
	}
	public double getTake_profit_pct() {
		return take_profit_pct;
	}
	public void setTake_profit_pct(double take_profit_pct) {
		this.take_profit_pct = take_profit_pct;
	}
	public double getTrailing_stop_pct() {
		return trailing_stop_pct;
	}
	public void setTrailing_stop_pct(double trailing_stop_pct) {
		this.trailing_stop_pct = trailing_stop_pct;
	}

}