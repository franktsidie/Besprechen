package de.hs_lu.o2s.ueb.ue1.huehner;

import junit.framework.TestCase;

/**
 * @author frank implementierung der klasse TestHuehner
 */
public class TestHuehner extends TestCase {
	public void testBertaBraunEi() {

		Ei ei1 = new Ei("Braun", 5.0);
		Henne hne1 = new Henne("Berta", ei1);

		System.out.println(hne1);
	}

	public void testEiGroesse() {
		
		Ei ei2 = new Ei("Weiß", 10.0);
		Henne hne2 = new Henne("Erna", ei2);
		
		assertEquals(hne2.getEi().getGroesse(), 10.0);
	}
}
