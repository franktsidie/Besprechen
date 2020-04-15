package uebung;

import java.util.Arrays;

public class Fahrzeugliste {
	/**
	 * hier werden die fahrzeuge gelistet
	 */
	private Fahrzeug[] fahrzeugList;

	/**
	 * standart konstruktor die fahrzeugliste wird mit 0(die länge )initiallisiert
	 */
	public Fahrzeugliste() {

		this.fahrzeugList = new Fahrzeug[0];
	}
	public Fahrzeugliste(int länge) {
		
		this.fahrzeugList = new Fahrzeug[länge];
	}

	
	
	@Override
	public String toString() {
		return "Fahrzeugliste [fahrzeugList=" + Arrays.toString(fahrzeugList) + "]";
	}
	
	public void addFahrzeug(Fahrzeug fahrzeug) {
		// TODO Auto-generated method stub
		
	}
	public void addFahrzeug(PKW fahrzeug) {
		// TODO Auto-generated method stub
		
	}
	public void addFahrzeug(Fahrzeugliste fL2) {
		// TODO Auto-generated method stub
		
	}
	public void delPKW_All() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * diese tostring methode gibt alle fahrzeuge züruck 
	 */
	
	
	
	
	
	
	
//	public String toString() {
//		String fahrzeugliste = "";
//		for (int i = 0; i < fahrzeugList.length; i++) {
//			fahrzeugliste = super.toString() + "\n";
//		}
//		return fahrzeugliste;
//
//	}
}