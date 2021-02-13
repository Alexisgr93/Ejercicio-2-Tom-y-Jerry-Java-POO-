import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class tesTomyJerry {
	
	Gato tom;
	Raton jerry;

	@BeforeEach
	void setUp() throws Exception {
		
		tom = new Gato();
		jerry = new Raton();
		
	}
	@Test
	void test() {
		tom.setEnergia(20);
		jerry.setPeso(4);
		
		System.out.println("Punto 1- b) \n¿Tom Puede Atrapar A Jerry? " + tom.TomPuedeAtraparaJerry(jerry));
		assertTrue(tom.TomPuedeAtraparaJerry(jerry));
		
	}
	
	@Test
	void testTomNoPuedeAtraparaJerry() {
		tom.setEnergia(10);
		jerry.setPeso(4);
		
		System.out.println("Punto 1- c) \n¿Tom Puede Atrapar A Jerry? " + tom.TomPuedeAtraparaJerry(jerry));
		assertFalse(tom.TomPuedeAtraparaJerry(jerry));
		
	}
	
	@Test
	void testTomCorreaJerry() {
		tom.setEnergia(20);
		jerry.setPeso(4);
		
		tom.setPosicion(30);
		jerry.setPosicion(34);
		
		tom.TomCorreaJerry(jerry);
		System.out.println("Punto 2- b) \nLa Energia de Tom queda en: " + tom.getEnergia());
		assertEquals(6, tom.getEnergia());
		
		System.out.println("La Posicion de Tom queda en: " + tom.getPosicion());
		assertEquals(34, tom.getPosicion());
	}

}
