package de.hs_lu.o2s.ueb.ue1.huehner;

/**
 * implementierung der klasse henne
 * 
 * @author frank
 *
 */
public class Henne {
	/**
	 * name der henne
	 */
	private String name;
	/**
	 * was für eir legt sie an von typ Ei
	 */
	private Ei ei;

	public Henne(String name, Ei ei) {

		this.name = name;
		this.ei = ei;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ei getEi() {
		return this.ei;
	}

	public void setEi(Ei ei) {
		this.ei = ei;
	}

	
	public String toString() {
		return "Henne mit Name " + this.name + "und " + this.ei.toString() + " ";
	}

}
