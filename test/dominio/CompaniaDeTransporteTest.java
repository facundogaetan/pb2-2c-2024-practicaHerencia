package dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CompaniaDeTransporteTest {
	
	@Test
	public void dadoQueExisteUnaCompaniaDeTransportePuedoAgregarVehiculos() {
		
		//preparacion
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000.0d, 5);
		
		//ejecucion
		Boolean agregado = companiaDeTransporte.agregar(vehiculo);
		
		//verificacion
		assertTrue(agregado);
	}
	
	@Test
	
	public void dadoQueExisteUnVehiculoPuedoCargarPasajeros() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000.0d, 5);
		
		//ejecucion
		Boolean pasajeroCargado = vehiculo.cargarPasajeros(4, 70);
		
		//verificacion
		assertTrue(pasajeroCargado);
	}
	
	@Test
	
	public void dadoQueExisteUnVehiculoPuedoObtenerCapacidadMaximaDePasajeros() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000.0d, 5);
		
		//ejecucion
	//	int capacidadMaximaDePasajeros = vehiculo.obtenerCapacidadMaximaDePasajeros();
		
		//verificacion
		assertEquals(5, vehiculo.obtenerCapacidadMaximaDePasajeros());
		
	}

}
