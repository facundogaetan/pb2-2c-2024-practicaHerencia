package dominio;

public class Vehiculo {

	private String patente;
	private double pesoMaximo;
	private int capacidadDeCarga;

	public Vehiculo(String patente, double pesoMaximo, Integer capacidadDeCarga) {
		this.patente = patente;
		this.pesoMaximo = pesoMaximo;
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Integer getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(Integer capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public Boolean cargarPasajeros(int numPasajeros, double pesoPorPasajero) {
		if (numPasajeros <= capacidadDeCarga && (numPasajeros * pesoPorPasajero) <= pesoMaximo) {
			return true;
		} else {
			return false;
		}
	}

	public int obtenerCapacidadMaximaDePasajeros() {
		return capacidadDeCarga;
	}
	
	

}
