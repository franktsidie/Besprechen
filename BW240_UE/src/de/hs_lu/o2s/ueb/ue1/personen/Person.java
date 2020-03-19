/**
 * 
 */
package de.hs_lu.o2s.ueb.ue1.personen;

/**
 * @author frank
 *
 */
public class Person {
	/*
	 * attributen festlegen
	 * 
	 */
	private String vorname, nachname;
	private Boolean beruftaetig;
	private String beruf;
	private Adresse adresse;
	private int geburtsjahr;

	Person() {

	}

	Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	Person(String vorname, String nachname, Adresse adresse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Boolean getBeruftaetig() {
		return this.beruftaetig;
	}

	public void setBeruftaetig(Boolean beruftaetig) {
		this.beruftaetig = beruftaetig;
	}

	public String getBeruf() {
		if (beruftaetig == false)
			return "Person ist nicht berufstätig";
		return this.beruf;
	}

	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adr1) {
		this.adresse = adr1;
	}

	public int getGeburtsjahr() {
		if (geburtsjahr > 1900)
			return this.geburtsjahr;
		return -1;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public String toString() {

		return this.vorname + " " + this.nachname + "\n" + "Beruf : " + this.beruf + "\n" + getBeruf()
				+ "\nGeboren im Jahr" + getGeburtsjahr() + "Adresse :" + adresse.toString()+"\n\n";
	}
}
