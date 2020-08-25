package test.logic;

import static org.junit.Assert.*;

import model.logic.Cinema;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Cinema modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Cinema(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		
	}

}
