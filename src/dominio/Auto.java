package dominio;

public class Auto extends Vehiculo {

	public Auto(String patente, int pesoMaximo, int capacidadDeCarga) {
		super(patente,pesoMaximo,capacidadDeCarga);
	}
	
	@Override
	public Boolean cargarPasajeros(int numPasajeros, int pesoPorPasajero) {
		super.cargarPasajeros(numPasajeros, pesoPorPasajero);
		return true;
	}

}
