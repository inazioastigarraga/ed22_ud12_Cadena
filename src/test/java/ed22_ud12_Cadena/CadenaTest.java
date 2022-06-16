package ed22_ud12_Cadena;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {
	
	Cadena c1;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cadena();
	}

	
	
	@Test
	void testLongitud() {
		int expected = 5;
		int actual = c1.longitud("Inazio");
		assertEquals(expected, actual);
	}
	@Test
	void testLongitudFail() {
		int expected = 1;
		int actual = c1.longitud("");
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testVocales() {
		int expected = 2;
		int actual = c1.vocales("Inazio");
		assertEquals(expected, actual);
	}
	@Test
	void testVocalesFail() {
		int expected = 1;
		int actual = c1.vocales("");
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testInvertir() {
		String expected = "revuJ";
		String actual = c1.invertir("Inazio");
		assertEquals(expected, actual);
	}
	
	@Test
	void testInvertirFail() {
		String expected = "revuJ";
		String actual = c1.invertir("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testContarLetra() {
		int expected = 1;
		int actual = c1.contarLetra("Inazio",'n');
		assertEquals(expected, actual);
	}
	
	@Test
	void testContarLetraFail() {
		int expected = 1;
		int actual = c1.contarLetra("", 'n');
		assertEquals(expected, actual);
	}

}
