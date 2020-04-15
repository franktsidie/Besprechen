package uebung;

public class Fahrzeug {
	
	private double max_geschwindigkeit;
	private int kennzeichen;
	/**
	 * alle klassen besitzen oder eberen die parameter  diese attributen 
	 * @param max_geschwindigkeit
	 * @param kennzeichen
	 */
	public Fahrzeug(double max_geschwindigkeit, int kennzeichen) {
		
		this.max_geschwindigkeit = max_geschwindigkeit;
		this.kennzeichen = kennzeichen;
	}
//standart konstruktur 
	
	public Fahrzeug() {
		System.out.println("achtung es es ist kein Fahrzeug erzeugt worden!!!");
	}
	public double getMax_geschwindigkeit() {
		return this.max_geschwindigkeit;
	}
	public void setMax_geschwindigkeit(double max_geschwindigkeit) {
		this.max_geschwindigkeit = max_geschwindigkeit;
	}
	public int getKennzeichen() {
		return this.kennzeichen;
	}
	public void setKennzeichen(int kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	
	@Override
	public String toString() {
		return "Fahrzeug mit  kennzeichen" + this.kennzeichen + "max_geschwindigkeit" + this.max_geschwindigkeit +"km/h"  ;
	}
	
}