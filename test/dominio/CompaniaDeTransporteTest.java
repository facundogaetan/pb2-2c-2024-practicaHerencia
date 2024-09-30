package dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CompaniaDeTransporteTest {

	@Test
	public void dadoQueExisteUnaCompaniaDeTransportePuedoAgregarVehiculos() {

		// preparacion
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000, 5);

		// ejecucion
		Boolean agregado = companiaDeTransporte.agregar(vehiculo);

		// verificacion
		assertTrue(agregado);
	}

	@Test

	public void dadoQueExisteUnVehiculoPuedoCargarPasajeros() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000, 5);

		// ejecucion
		Boolean pasajeroCargado = vehiculo.cargarPasajeros(4, 70);

		// verificacion
		assertTrue(pasajeroCargado);
	}

	@Test

	public void dadoQueExisteUnVehiculoPuedoObtenerCapacidadMaximaDePasajeros() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000, 5);

		// ejecucion
		// int capacidadMaximaDePasajeros =
		// vehiculo.obtenerCapacidadMaximaDePasajeros();

		// verificacion
		assertEquals(5, vehiculo.obtenerCapacidadMaximaDePasajeros());

	}

	@Test

	public void dadoQueExisteUnVehiculoPuedoObtenerPesoMaximo() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Vehiculo vehiculo = new Vehiculo("abc123", 1000, 5);

		// ejecucion

		// verificacion
		assertEquals(1000, vehiculo.obtenerPesoMaximo());

	}

	@Test

	public void dadoQueExisteUnaCompaniaDeTransportePuedoAgregarUnColectivo() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Colectivo colectivo = new Colectivo("aaa111", 10000, 40);

		// ejecucion
		Boolean agregado = companiaDeTransporte.agregar(colectivo);

		// verificacion
		assertTrue(agregado);
	}

	@Test

	public void dadoQueExisteUnaCompaniaDeTransportePuedoAgregarUnCamion() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Camion camion = new Camion("aaa112", 6000, 2);

		// ejecucion
		Boolean agregado = companiaDeTransporte.agregar(camion);

		// verificacion
		assertTrue(agregado);
	}

	@Test

	public void dadoQueExisteUnaCompaniaDeTransportePuedoAgregarUnAuto() {
		CompaniaDeTransporte companiaDeTransporte = new CompaniaDeTransporte();
		Auto auto = new Auto("aaa113", 2000, 5);

		// ejecucion
		Boolean agregado = companiaDeTransporte.agregar(auto);

		// verificacion
		assertTrue(agregado);
	}

}
