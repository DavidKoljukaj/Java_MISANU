package UUP;

import java.io.*;
import java.text.DecimalFormat;

public class PetiZadatak {

	public static void main(String[] args) throws Exception {
					// Sastaviti algoritam i napisati program kojim se izracunava i stampa zbir i razlika vrednosti funkcija f i g 
					// f = (a - b) / (c + a) / (c + b) / (c - b);
					// g = (a + b + Math.sin(a)) * Math.cos(c);
					// Unos promenljivih a,b i c
					BufferedReader ulaz = new BufferedReader( new InputStreamReader(System.in));
					DecimalFormat df = new DecimalFormat("#.###");
					double a,b,c,f,g,zbir,razlika;
					System.out.println("Unesite vrednost za a: ");
					a = Double.parseDouble(ulaz.readLine());
					System.out.println("Unesite vrednost za b: ");
					b = Double.parseDouble(ulaz.readLine());
					System.out.println("Unesite vrednost za c: ");
					c = Double.parseDouble(ulaz.readLine());
					// Izracunavanje funkcija
					f = (a - b) / (c + a) / (c + b) / (c - b);
					g = (a + b + Math.sin(a)) * Math.cos(c);
					zbir = f + g;
					razlika = f - g;
					System.out.println("Za unete vrednosti funkcija f =" + f + ",a g = " + g);
					System.out.println("Zbir vrednosti funkcija f i g je:" + df.format(zbir) + ",a razlika: " + df.format(razlika));
	}

}
