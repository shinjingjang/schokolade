package schokolade;

import static org.junit.Assert.*;

import org.junit.*;


public class TestGasVerbrauch {
	 GasVerbrauch gv=new GasVerbrauch();
	
	@Test(expected= UnzulaessigerVerbauchException.class)
	public void negativtest() throws UnzulaessigerVerbauchException {
		assertNotNull(gv);
		
		 
		//int verbrauch= -2;
		
		gv.berechneGaspreis(1);
		int array[] = new int[1];
		int x = array[5];
		System.out.println(x);
	}
	
	@Test
	public void zwischenwertTesten() throws UnzulaessigerVerbauchException{
		
		assertTrue(0 == gv.berechneGaspreis(0));
		assertTrue(10==gv.berechneGaspreis(50));
		//assertEquals(10., 10.);
	}
	@Test
	public void testzwischen50500()throws UnzulaessigerVerbauchException{
		assertTrue(10.15==gv.berechneGaspreis(51));
		assertTrue(77.5==gv.berechneGaspreis(500));
		
	}

	
}
