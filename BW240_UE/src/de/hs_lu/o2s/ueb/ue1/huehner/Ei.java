package de.hs_lu.o2s.ueb.ue1.huehner;

/**
 * impleemment der klasse EI und seine attribute
 * 
 * @author frank
 *
 */
public class Ei {
	/**
	 * farbe des eirs
	 */
	private String farbe;
	/**
	 * größe des eiers
	 */
	private double groesse;

	public Ei(String farbe, double groesse) {
		
		this.farbe = farbe;
		this.groesse = groesse;
	}

	public String getFarbe() {
		return this.farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getGroesse() {
		return this.groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	
	public String toString() {
		return "Ei mit Farbe " + this.farbe + " und Größe " + this.groesse + "\n";
	}

}
