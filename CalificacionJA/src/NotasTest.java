import static org.junit.Assert.*;

import org.graalvm.compiler.nodes.NodeView.Default;
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
	public void testEscapicua() {
		assertTrue("Probando 33" ,package.Notas.obtenerNota(33));
		assertTrue("Probando 242" ,capicua5.Escapicua.escapicua(242));
		assertEquals("Probando 11",true,Escapicua.escapicua(11));
	}
	@Test
	public void testEscapicua2() {
		assertFalse("Probando 31" ,capicua5.Escapicua.escapicua(31));
		assertFalse("Probando 253" ,capicua5.Escapicua.escapicua(253));
		assertEquals("Probando 998",false,Escapicua.escapicua(998));
	}
