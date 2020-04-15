package uebung;



public class Fahrzeugbesitzer extends Person {
	Fahrzeugliste fahrzeuglisste;
	
	 
	public Fahrzeugbesitzer(String vorname, String nachname, Fahrzeugliste zugeordnete_fahrzeugliste) {
		super(vorname, nachname, zugeordnete_fahrzeugliste);
		// TODO Auto-generated constructor stub
	}

	/*
	 * toString FahrzeugBesitzer: <person.toString> hat folgende Fahrzeuge:
	 * <Rückgabe aller Elemente der fahrzeugListe>
	 */
	@Override
	public String toString() {
		return super.toString() + " hat folgende Fahrzeuge:" + fahrzeuglisste.toString();
	}
}
