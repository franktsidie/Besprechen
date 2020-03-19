package de.hs_lu.o2s.ueb.ue1.personen;

import junit.framework.TestCase;
/**
 * 
 * @author frank
 *implementierung der klasse testperson
 */
public class TestPerson extends TestCase {
	public void testAdressenPerson(){
		Adresse adr1 = new Adresse("Grüner Weg ", "12", "67434","Neustadt/Weinstr.","Rheinland-pfalz","Deutschland");
		Adresse adr2 = new Adresse("Ernst-Boehe-Str. ","4", "67059","Ludwigshafen am Rhein","Rheinland-pfalz","Deutschland");
		System.out.println(adr1.toString());
		System.out.println(adr2.toString());
		
		
		Person p1 = new Person("Arthur ","Clarke");
		p1.setAdresse(adr1);
		Person p2 = new Person("Peter"," Mudras",adr2);
		Person p3 = new Person("Thomas"," Schüssler", new Adresse("Paul-Wittsack-Straße","10","68163","Mannheim","Baden-Württemberg","Deutschland"));
		
		p2.setBeruftaetig(true);
		p3.setBeruftaetig(true);
		p1.setBeruftaetig(false);
		p2.setBeruf("Lehrer");
		p3.setBeruf("Lehrer");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		
	}
	public void testGeburtsjahr(){
		Person p4= new Person("Michael","schneider",2000) ;
		p4.setGeburtsjahr(1980);
		assertEquals(p4.getGeburtsjahr() ,1980);
	}
}
