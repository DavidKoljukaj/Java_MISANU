
public class Plata {

	String radnik;
	double ostvareniPrihod;
	double visinaProcenta;

	Plata() {
		radnik = "blanko";
		ostvareniPrihod = 0.0;
		visinaProcenta = 0.0;

	}

	Plata(String r, double o, double p) {
		radnik = r;
		ostvareniPrihod = o;
		visinaProcenta = p;

	}

	public double visinaPlate() {
		return ostvareniPrihod * visinaProcenta / 100;
	}

	public double getPrihod() {
		return ostvareniPrihod;
	}

	public String ispisivanjeRadnikPlata() {
		return "\t" + this.radnik + "\t\t" + this.visinaPlate();
	}
}
