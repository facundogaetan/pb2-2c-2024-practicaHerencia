package dominio;

public class Colectivo extends Vehiculo {


	public Colectivo(String patente, int pesoMaximo, int capacidadDeCarga) {
		super(patente, pesoMaximo, capacidadDeCarga);
	}
	
	
	@Override
	public Boolean cargarPasajeros(int numPasajeros, int pesoPorPasajero) {
		super.cargarPasajeros(numPasajeros, pesoPorPasajero);
		return true;
	}

}
