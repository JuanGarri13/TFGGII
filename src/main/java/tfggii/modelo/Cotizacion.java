package tfggii.modelo;

import java.time.LocalDate;

public class Cotizacion {
    private LocalDate fecha;
    private double precioApertura;
    private double maximo;
    private double minimo;
    private double precioCierre;
    private double volumen;

    public Cotizacion() {
    }

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getPrecioApertura() {
		return precioApertura;
	}

	public void setPrecioApertura(double precioApertura) {
		this.precioApertura = precioApertura;
	}

	public double getMaximo() {
		return maximo;
	}

	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}

	public double getMinimo() {
		return minimo;
	}

	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public double getPrecioCierre() {
		return precioCierre;
	}

	public void setPrecioCierre(double precioCierre) {
		this.precioCierre = precioCierre;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
}