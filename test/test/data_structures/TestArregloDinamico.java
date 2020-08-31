package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1()
	{
		arreglo= new ArregloDinamico(TAMANO);
	}

	public void setUp2() 
	{
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}
	
	@Test
	public void testAgregar( )
	{
		arreglo.agregar("a");
		assertTrue(arreglo.getElement(arreglo.isPresent("a")).equals("a"));
		arreglo.removeFirst();
		setUp2( );
		assertEquals(arreglo.getElement(119),(""+119));
		
	}
	
	@Test
	public void testGetElement( ) 
	{
		setUp2();
		assertEquals(arreglo.getElement(20),""+20);
		assertNull(arreglo.getElement(300));
	}
	
	@Test
	public void testBuscar( ) 
	{
		assertNull(arreglo.buscar("a"));
		setUp2( );
		assertEquals(arreglo.buscar(""+68),(""+68));
	}
	
	@Test
	public void testEliminar( ) 
	{
		setUp2();
		assertEquals(arreglo.eliminar(""+68),(""+68));
		
		
	}
	
	@Test
	public void testSize( ) 
	{
		arreglo.agregar(""+0);
		assertTrue(arreglo.size()==1);
		setUp2();
		assertTrue(arreglo.size()==201);
		arreglo.deleteElement(0);
		assertEquals(arreglo.size(),200);
	}

	@Test
	public void testAddFirst( )
	{
		setUp2();
		arreglo.addFirst("-1");
		assertEquals("-1",arreglo.getElement(0));
		for(int i = 1; i < 15; i++)
			assertTrue(Integer.parseInt((String) arreglo.getElement(i)) > Integer.parseInt((String) arreglo.getElement(i-1)));
		arreglo.addFirst("a");
		assertEquals("a",arreglo.getElement(0));
		
		
	}

	@Test
	public void testAddLast( )
	{
		
		arreglo.addLast("-1");
		assertEquals("-1",arreglo.getElement(0));
		setUp2();
		arreglo.addLast("a");
		assertEquals("a",arreglo.getElement(arreglo.size()-1));
	}

	@Test
	public void testInsertElement( )
	{
		arreglo.insertElement("0", 0);
		assertEquals("0",arreglo.getElement(0));
		arreglo.removeFirst();
		setUp2();
		arreglo.insertElement("a", 50);
		assertEquals("a",arreglo.getElement(50));
		assertEquals("50",arreglo.getElement(51));
	}

	@Test
	public void testRemoveFirst( )
	{
		setUp2();
		arreglo.addFirst("-1");
		assertEquals("-1",arreglo.getElement(0));
		arreglo.removeFirst();
		assertEquals("0",arreglo.getElement(0));
		for(int i = 1; i < 15; i++)
			assertTrue(Integer.parseInt((String) arreglo.getElement(i)) > Integer.parseInt((String) arreglo.getElement(i-1)));
		arreglo.removeFirst();
		assertEquals("1",arreglo.getElement(0));
	}

	@Test
	public void testRemoveLast( )
	{
		setUp2();
		arreglo.addLast("-1");
		arreglo.removeLast();
		assertEquals("185",arreglo.getElement(185));
		

	}

	@Test
	public void testDeleteElement( )
	{
	setUp2();
	assertEquals("55",arreglo.deleteElement(55));
	for(int i = 50; i < 60; i++)
		assertTrue(Integer.parseInt((String) arreglo.getElement(i)) > Integer.parseInt((String) arreglo.getElement(i-1)));
	}

	@Test
	public void testFirstElement( ) 
	{
		assertNull(arreglo.firstElement());
		setUp2( );
		assertEquals("0",arreglo.firstElement());
	}

	@Test
	public void testLastElement( )
	{
		assertNull(arreglo.lastElement());
		setUp2( );
		assertEquals("199",arreglo.lastElement());
	}

	@Test
	public void testIsEmpty()
	{
		assertTrue(arreglo.isEmpty());
		arreglo.addFirst("0");
		assertFalse(arreglo.isEmpty());
	
	}
	@Test
	public void testIsPresentBinary ( ) 
	{
		
	}

	@Test
	public void testIsPresent ( ) 
	{
		assertEquals(-1,arreglo.isPresent("No existe"));
		setUp2();
		assertEquals(195, arreglo.isPresent("195"));
		assertEquals(123, arreglo.isPresent("123"));

	}
	@Test
	public void testExchange ( )
	{
		setUp2();
		arreglo.exchange(0, 199);
		assertEquals("0", arreglo.getElement(199));
		assertEquals("199", arreglo.getElement(0));
		
	}

	@Test
	public void testChangeInfo ( )
	{
		setUp2();
		arreglo.changeInfo(0,"a");
		assertEquals("a", arreglo.getElement(0));
		arreglo.changeInfo(16,"r");
		assertEquals("r", arreglo.getElement(16));
	
	}

}
