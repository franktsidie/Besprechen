package de.hs_lu.o2s.ueb.ue2.cardgames;

import java.util.Arrays;

import de.hs_lu.o2s.v3.cardgames.Kartenspiel;
import de.hs_lu.o2s.v3.cardgames.Spielkarte;

public class Kartenstapel {

	/**
	 * Array vom Typ Spielkarte, welches alle Karten enthält die auf dem Stapel
	 * liegen Index: 0: unterste Karte; kartenA.length-1: oberste Karte
	 */
	Spielkarte[] kartenA;

	/**
	 * Konstruktor für einen leeren Kartenstapel
	 */
	public Kartenstapel() {
		kartenA = new Spielkarte[0];
	}

	/**
	 * Konstruktor für einen Kartenstapel mit genau einer Karte
	 */
	public Kartenstapel(Spielkarte spielkarte) {
		kartenA = new Spielkarte[1];
		kartenA[0] = spielkarte;
	}

	/**
	 * Konstruktur zur Generierung eines Kartenstapels aus dem gegebenen Kartenspiel
	 */
	public Kartenstapel(Kartenspiel spiel) {
		kartenA = new Spielkarte[spiel.getKartenAnzahl()];

		// kartenAA referenziert auf die im Spiel angelegten einzelnen Karten
		Spielkarte[][] kartenAA = spiel.getKartenAA();

		int index = 0;
		// mit kartenAA.length bekommen wir die Länge des äußeren Arrays
		for (int i = 0; i < kartenAA.length; i++) {
			// mit kartenAA[0].length holen wir uns die Länge des inneren Arrays
			for (int j = 0; j < kartenAA[0].length; j++) {
				// hier wollen wir in dem Array kartenA die jeweilige Spielkarte abspeichern
				kartenA[index] = kartenAA[i][j];
				index++;
			}
		}
	}

	// unn�tige konstruktor
	public Kartenstapel(int i) {

	}

	/**
	 * Legt die übergebene Karte auf den Kartenstapel
	 */
	public void push(Spielkarte newCard) {
		// ein um 1 größeres Array anlegen
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length + 1];

		// die bisherigen Karten in das neue Array kopieren
		System.arraycopy(kartenA, 0, kartenNeu, 0, kartenA.length);

		// die neue Karte auf den Stapel legen bzw. auf die letzte Position im neuen
		// Array abspeichern
		kartenNeu[kartenNeu.length - 1] = newCard;

		// den neuen Stapel der alten Objektvariablen zuweisen
		kartenA = kartenNeu;
	}

	/**
	 * entnehmen vom kartenA, entfernen vom kartenA und zur�ck geben
	 * 
	 * wir erhalten am ende ein k�zeres array
	 * 
	 * @return
	 */
	public Spielkarte pop() {

		Spielkarte gespeichert = this.kartenA[this.kartenA.length - 1];
		Spielkarte[] kartenNeu = new Spielkarte[this.kartenA.length - 1];
		
		// Swapping in process
		for (int i = 0; i < this.kartenA.length - 1; i++) {
			kartenNeu[i] = this.kartenA[i];

		}
		this.kartenA = kartenNeu;
		return gespeichert;
	}

	/**
	 * die methode gibt die oberste karte z�ruck, wenn nicht leer ist
	 * 
	 * @return
	 */
	public Spielkarte top() {
		if (this.kartenA[this.kartenA.length - 1] == null) {
			return null;
		} else {
			return this.kartenA[this.kartenA.length - 1];
		}
	}

	/**
	 * die methode gibt die unterste Karte karte z�ruck ,wenn nicht leer ist
	 * 
	 * @return
	 */
	public Spielkarte last() {

		if (this.kartenA[0] == null) {
			return null;
		} else {
			return this.kartenA[0];
		}

	}

	/**
	 * hier wird es gepr�ft ,ob der Kartenstapel leer ist. dafur ben�tige ich ein
	 * loop um das array zu durchlaufen .
	 * 
	 * @return
	 */
	public boolean empty() {
		for (int i = 0; i < kartenA.length; i++) {
			if (this.kartenA[i] != null) {

				return false;// wenn nicht leer ist .

			}
		}
		return true;// wenn doch .
	}

	/**
	 * der anzahl des stapels wird hier einfach uebermitellt werden.
	 * 
	 * @return
	 */
	public int getKartenAnzahl() {
		return kartenA.length;
	}

	/**
	 * von der Methode hier bekommen wir die die gnaue gesamtpunktzahl zurueck ich
	 * 
	 * laufe das array durch und sammele die werte durch den abruf von
	 * getPunktwert() in Spielkarte
	 * 
	 * @return
	 */
	public int getPunktwert() {

		int gesamtpunktzahl = 0;

		for (int i = 0; i < this.kartenA.length; i++) {

			gesamtpunktzahl += this.kartenA[i].getPunktwert();
		}
		return gesamtpunktzahl;
	}

	@Override
	public String toString() {
		/**
		 * ich erzeuge explicite ein string und eine for loop(da es sich um ein array
		 * handelt.) zur gestaltung des tostring methode
		 * 
		 * dabei ben�tige ich die tostring vom spielkarte daher den befehl "
		 * kartenA[i].toString()"
		 */
		String str = "";

		for (int i = 0; i < kartenA.length - 1; i++) {

			str += kartenA[i].toStringKurz() + ",\n";

		} // das "length-1" ist da zur vermeidung des koma an der letzte stelle

		str += kartenA[kartenA.length - 1].toStringKurz() ;

		return "Kartenstapel mit " + getKartenAnzahl() + " Karten, einem Punktwert von " + getPunktwert()
				+ " und den folgenden Karten:\n" + str + "";
	}

	/**
	 * ein neues kartenspiel wird angelegt.
	 * 
	 * @param kartenspiel
	 */
	public void addKartenspiel(Kartenspiel kartenspiel) {

		Spielkarte[] kartenNeu = new Spielkarte[this.kartenA.length + kartenspiel.getKartenAnzahl()];
		Spielkarte[][] kartenAA = kartenspiel.getKartenAA();

		for (int i = 0; i < this.kartenA.length; i++) {
			kartenNeu[i] = this.kartenA[i];

		}
		int index = this.kartenA.length;// es macht da weiter wo die erste schleife aufgeh�rt hat

		for (int i = 0; i < kartenAA.length; i++) {

			for (int j = 0; j < kartenAA[0].length; j++) {
				// hier wollen wir in dem Array kartenA die jeweilige Spielkarte abspeichern
				kartenNeu[index] = kartenAA[i][j];
				index++;
			}
		}
		// hier wird kartenA mit kartenNeu ersetzt
		this.kartenA = kartenNeu;

	}

	/**
	 * //ein neues stapel wird in kartenstapel angelegt
	 * 
	 * @param zusStapel
	 */
	public void addKartenstapel(Kartenstapel zusStapel) {

		Spielkarte[] kartenNeu = new Spielkarte[this.kartenA.length + zusStapel.kartenA.length];

		for (int i = 0; i < this.kartenA.length; i++) {
			kartenNeu[i] = this.kartenA[i];
		}
		for (int i = this.kartenA.length; i < this.kartenA.length + zusStapel.kartenA.length; i++) {
			kartenNeu[i] = zusStapel.kartenA[i - this.kartenA.length];
		}

		// hier wird kartenA mit kartenNeu ersetzt
		this.kartenA = kartenNeu;

	}

	/**
	 * entfernen aus dem array
	 * 
	 * @return
	 */
	public Spielkarte popRandomCard() {
		/**
		 * ich erschaffe zun�cht eine neue spielkarte der mit dem laufenden karte
		 * befullt wird ohne die entfernte karte zu ubernehmen
		 * 
		 * ich k�rze auch die l�nge um 1
		 */
		Spielkarte[] kartenNeu = new Spielkarte[this.kartenA.length - 1];
		/**
		 * entfernen ist eine zuf�llige karte ,die ich l�chen werde.
		 *  es wird vom
		 * Math.random() gew�hlt.
		 */
		Spielkarte entfernen = null;

		int zufall = (int) (Math.random() * this.kartenA.length);

		entfernen = this.kartenA[zufall];

		// es wird dann vom kartenA gel�cht
		this.kartenA[zufall] = null;

		for (int i = 0;  i < this.kartenA.length; i++) {
			int j=0;
			/**
			 * ich laufe die ueber die spielkarte durch und kopiere dann die kartenA in
			 * kartenNeu daf�r ben�tige ich eine verzweigung ,der pr�ft, ob die stelle
			 * besetzt ist ,um es dann zu kopieren
			 */

			if (kartenA[i] == null) {

				continue; // ueberspringe die stelle , und pr�fe weiter

			} else { // Der sawp wird dann ausgef�hrt

				kartenNeu[j] = kartenA[i];
				j++;
			}
		}
		this.kartenA = kartenNeu; // ich uebergebe dann den neuen wert

		return entfernen; // und am ende gebe ich die random karte z�ruck.
	}

}
