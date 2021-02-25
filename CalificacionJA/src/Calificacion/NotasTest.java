package Calificacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NotasTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotas() {
		assertTrue("Probando 7" ,Calificacion.Notas.obtenerNota( 7));
		assertTrue("Probando 10" ,Calificacion.Notas.obtenerNota( 10));
		assertEquals("Probando 6",true,Notas.obtenerNota( 6));
	}
	@Test
	public void testNotas2() {
		assertFalse("Probando 12" ,Calificacion.Notas.obtenerNota(12));
		assertFalse("Probando 13" ,Calificacion.Notas.obtenerNota(13));
		assertEquals("Probando 11",false,Notas.obtenerNota(11));
	}
}	