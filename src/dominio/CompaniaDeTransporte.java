package dominio;

import java.util.ArrayList;
import java.util.List;

public class CompaniaDeTransporte {
	
	List<Vehiculo> vehiculos;
	
	public CompaniaDeTransporte() {
		this.vehiculos = new ArrayList<>();
	}

	public Boolean agregar(Vehiculo vehiculo) {
		return this.vehiculos.add(vehiculo);
	}

}
