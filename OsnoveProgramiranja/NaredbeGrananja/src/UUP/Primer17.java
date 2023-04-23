package UUP;

import java.io.*;
import java.text.DecimalFormat;

public class Primer17 {

	public static void main(String[] args) throws Exception {
				//Deklarisanje podataka
		double	x,y,z,f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		//Unos podataka
		System.out.println("Unesite vrednost za X: ");
		x = Double.parseDouble(ulaz.readLine());
		System.out.println();
		System.out.println("Unesite vrednost za Y: ");
		y = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za Z: ");
		z = Double.parseDouble(ulaz.readLine());
		
		if(2*x!=y) {
			//izracunavanje vrednosti funkcije f
			f = (x+y)*(x+z)/(2*x-y);
			
			//Stampanje rezultata
			System.out.println("Vrednost funkcije f je " +df.format(f));
		}
		else
			//Stampanje poruke korisniku o pogresnom unosu podataka
			System.out.println("Unos podataka nije ispravan (Y se mora razlikovati od 2X).");
		ulaz.close();
	}

}
