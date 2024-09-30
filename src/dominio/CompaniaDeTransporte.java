package dominio;

import java.util.ArrayList;
import java.util.List;

public class CompaniaDeTransporte {
	
	private List<Vehiculo> vehiculos;
	private List<Colectivo> colectivos;
	private List<Camion> camiones;
	private List<Auto> autos;
	
	public CompaniaDeTransporte() {
		this.vehiculos = new ArrayList<>();
		this.colectivos = new ArrayList<>();
		this.camiones = new ArrayList<>();
		this.autos = new ArrayList<>();
	}

	public Boolean agregar(Vehiculo vehiculo) {
		return this.vehiculos.add(vehiculo);
	}

	public Boolean agregar(Colectivo colectivo) {
		// TODO Auto-generated method stub
		return this.colectivos.add(colectivo);
	}

}
