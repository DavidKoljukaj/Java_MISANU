package Zadatak;

public class Taksista {
	private String imeKompanije;
	private String ime;

	Taksista(String s) {
		this.ime = s;
	}

	Taksista(String s, String ss) {
		this.ime = s;
		this.imeKompanije = ss;
	}

	public void zadajIme(String n) {
		this.ime = n;
	}

	public String uzmiIme() {
		return ime;
	}

	public void zadajPravac() {

	}

	public String uzmiImeKompanije() {
		return imeKompanije;
	}
}
