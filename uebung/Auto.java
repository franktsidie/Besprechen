package de.hs_lu.o2s.tut1.uebung;

public class Auto {
	private String kennzeichen;
	private double tankInthalt;
	private double verbrauch;
	private double kilometerStand;
	private String besitzer;

	public Auto() {
		System.out.println("Achtung! Es wurde ein Standardkonstruktor verwendet!");
	}

	public Auto(String kennzeichen, double tankInthalt, double verbrauch, double kilometerStand) {

		this.kennzeichen = kennzeichen;
		this.tankInthalt = tankInthalt;
		this.verbrauch = verbrauch;
		this.kilometerStand = kilometerStand;
	}

	public Auto(String kennzeichen, double tankInthalt, double verbrauch, double kilometerStand, Person besitzer) {

		this.kennzeichen = kennzeichen;
		this.tankInthalt = tankInthalt;
		this.verbrauch = verbrauch;
		this.kilometerStand = kilometerStand;
		this.besitzer =  besitzer.getNachname() +" "+besitzer.getVorname();
	}

	@Override
	public String toString() {

		if (this.kennzeichen == "" || this.besitzer == ""||this.kennzeichen == null || this.besitzer == null)
			
			return "Achtung, Auto ist nicht zugelassen." + "\n";
		else
			return "kilometerStand :" + kilometerStand + "\nverbrauch :" + verbrauch + "/ 100Km\n" + "kennzeichen :"
					+ kennzeichen + "\nbesitzer :" + this.besitzer + "\n";
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public double getTankInthalt() {
		return tankInthalt;
	}

	public void setTankInthalt(double tankInthalt) {
		this.tankInthalt = tankInthalt;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public double getKilometerStand() {
		return kilometerStand;
	}

	public void setKilometerStand(double kilometerStand) {
		this.kilometerStand = kilometerStand;
	}

	public String getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(String besitzer) {
		this.besitzer =besitzer;
	}
}
