package de.hs_lu.o2s.ueb.ue1.personen;
/**
 * @author frank
 *
 */
public class Adresse {
	/**
	 * str (name der strasse)
	 *
	 */
	private String str;

	/**
	 * hnr,das hausnummer
	 *
	 */
	private String hnr;
	/**
	 * plz, die postleitzahl der betrofene
	 *
	 */
	private String plz;
	/**
	 * stadt,die stadt des mannes
	 *
	 */
	private String stadt;
	/**
	 * bundesland, die bundesland
	 *
	 */
	private String bundesland;
	/**
	 * land in welche land liegt das haus
	 *
	 */
	private String land;

	public Adresse(String str, String hnr, String plz, String stadt, String bundesland, String land) {

		this.str = str;
		this.hnr = hnr;
		this.plz = plz;
		this.stadt = stadt;
		this.bundesland = bundesland;
		this.land = land;
	}

	public String getStr() {
		return this.str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getHnr() {
		return this.hnr;
	}

	public void setHnr(String hnr) {
		this.hnr = hnr;
	}

	public String getPlz() {
		return this.plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return this.stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getBundesland() {
		return this.bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}

	public Boolean liegtInRLP() {
		if (this.bundesland == "Rheinland-pfalz" || this.bundesland == "RHEINLAND-PFALZ") {
			return true;
		}
		return false;

	}

	public String getLand() {
		return this.land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	@Override
	public String toString() {
		return this.str + " " + this.hnr + "\n" + this.plz + " " + this.stadt + "\n" + this.bundesland + "\n" + this.land+"\n";
	}
}
