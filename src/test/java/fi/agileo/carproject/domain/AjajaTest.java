package fi.agileo.carproject.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fi.agileo.carproject.domain.Ajaja;
import fi.agileo.carproject.domain.Ajaja.Ajotapa;
import fi.agileo.carproject.domain.Auto;
@RunWith(MockitoJUnitRunner.class)
public class AjajaTest {

	@Mock
	Auto mockAuto;
	
	@Before
	public void setUp(){
		when(mockAuto.laskeNopeus1()).thenReturn(100.0);
	}
	
	@Test
	public void testAja1Aggressiivinen() {
		Ajaja testattava = new Ajaja(mockAuto, "Kuski1", Ajotapa.AGGRESSIIVINEN);
		assertEquals(0.01,testattava.aja1(0.0001),0.0001);
		assertEquals(50,testattava.aja1(0.5),0.0001);
		assertEquals(100,testattava.aja1(1.0),0.0001);
		assertEquals(0.0,testattava.aja1(-1.0),0.0001);
		assertEquals(10000000,testattava.aja1(100000),0.0001);
		
	}

	@Test
	public void testAja1Tavallinen() {
		Ajaja testattava = new Ajaja(mockAuto, "Kuski1", Ajotapa.TAVALLINEN);
		assertEquals(0.007,testattava.aja1(0.0001),0.0001);
		assertEquals(35,testattava.aja1(0.5),0.0001);
		assertEquals(70,testattava.aja1(1.0),0.0001);
		assertEquals(0.0,testattava.aja1(-1.0),0.0001);
		assertEquals(7000000,testattava.aja1(100000),0.0001);
		
	}

	@Test
	public void testAja1Rauhallinen() {
		Ajaja testattava = new Ajaja(mockAuto, "Kuski1", Ajotapa.RAUHALLINEN);
		assertEquals(0.004,testattava.aja1(0.0001),0.0001);
		assertEquals(20,testattava.aja1(0.5),0.0001);
		assertEquals(40,testattava.aja1(1.0),0.0001);
		assertEquals(0.0,testattava.aja1(-1.0),0.0001);
		assertEquals(4000000,testattava.aja1(100000),0.0001);
		
	}

}
