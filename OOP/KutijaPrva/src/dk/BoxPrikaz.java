package dk;

import java.text.DecimalFormat;

public class BoxPrikaz {

	public static void main(String[] args) {
		Box kutija = new Box();
		DecimalFormat df = new DecimalFormat("#.##");

		double zapremina;
		kutija.dubina = 10;
		kutija.sirina = 15;
		kutija.visina = 20;

		zapremina = kutija.sirina * kutija.visina * kutija.dubina;

		System.out.println("Kutija ima zapreminu: " + df.format(zapremina) + "cm");
	}

}
