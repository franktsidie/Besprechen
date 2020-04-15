package uebung;

public class Person {
	private String vorname;
	private String nachname;
	private Fahrzeugliste zugeordnete_fahrzeugliste;

	public Person(String vorname, String nachname, Fahrzeugliste zugeordnete_fahrzeugliste) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.zugeordnete_fahrzeugliste = zugeordnete_fahrzeugliste;
	}

	/**
	 * die toString gibt den besitzer züruck.
	 */
	@Override
	public String toString() {
		return "Person : Vorname=" + this.vorname + ", Nachname=" + this.nachname 
				;
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

	public Fahrzeugliste getZugeordnete_fahrzeugliste() {
		return this.zugeordnete_fahrzeugliste;
	}

	public void setZugeordnete_fahrzeugliste(Fahrzeugliste zugeordnete_fahrzeugliste) {
		this.zugeordnete_fahrzeugliste = zugeordnete_fahrzeugliste;
	}
}
