package de.hs_lu.o2s.tut1.uebung;

public class Person {
	private String vorname;
	private String nachname;
	private String geburtstag;
	
	public Person(String vorname, String nachname, String geburtstag) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtstag = geburtstag;
	}
	public Person(String vorname, String nachname) {
		
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	
	public String toString() {
		return " " + vorname + " " + nachname + "\n";
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getGeburtstag() {
		return geburtstag;
	}
	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}
}
