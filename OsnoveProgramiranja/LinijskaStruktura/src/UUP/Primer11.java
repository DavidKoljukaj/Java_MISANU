package UUP;

import java.io.*;
import java.text.DecimalFormat;


public class Primer11 {

	public static void main(String[] args)	throws Exception {
				//1 ulaz- ucitati stranice trougla a, b i c
				//2 obrada - s = (a+b+c)/2 poluobim
				//			P = Math.sqrt(s*
				//3 izlaz R,r,d
		
				//a,b,c - stranice trougla
				//s- poluobim trougla
				//p - povrsina trougla
				//R - poluprecnik opisanog kruga
				//r - poluprecnik upisanog kruga
				//d - rastojanje izmedu centara upisanog i opisanog kruga
				double a,b,c,s,p,R,r,d;
				DecimalFormat df = new DecimalFormat("#.####");
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				
				// Unos podataka
				System.out.println("Unesite vrednost za a:");
				a = Double.parseDouble(ulaz.readLine());
				System.out.println("Unesite vrednost za b: ");
				b = Double.parseDouble(ulaz.readLine());
				System.out.println("Unesite vrednost za c: ");
				c = Double.parseDouble(ulaz.readLine());
				
				//Izracunavanje vrednosti
				s = (a + b + c) / 2;
				p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				R = a * b * c / (4 * p);
				r = a * b * c / (2 * R * s);
				d = Math.sqrt(R * (R - 2 * r));
				//Stampanje rezultata
				System.out.println("R = " + df.format(R) + "\nr = " + df.format(r) + "\nd = " + df.format(d));
				ulaz.close();
				
	}

}
