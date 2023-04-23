package UUP;

public class Izuzetak extends Exception {
	// Indeks studenata koji dovodi do izuzetka
	private int indeksStudenta;

	// Podrazumevani konstruktor
	public Izuzetak() {
		indeksStudenta = -1;
	}

	public Izuzetak(int indeksStudenta) {
		super("Desio se izuzetak: broj indeksa studenta je manji od 0 ili veci od 100.");
		this.indeksStudenta = indeksStudenta;
	}

	// Uzimanje indeksa studenta za koji se desila greska
	public int getIndeksStudenta() {
		return indeksStudenta;
	}
}
