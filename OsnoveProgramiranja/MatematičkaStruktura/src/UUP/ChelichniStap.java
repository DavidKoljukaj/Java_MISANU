package UUP;

import java.io.*;
import java.text.DecimalFormat;

public class ChelichniStap {

	public static void main(String[] args) throws Exception {
					double F,A,L,E,mi,deltaL,deltaA;
					
					DecimalFormat df = new DecimalFormat("#.##");
					//BufferedReader ulaz = new BufferedReader (new InputStreamReader(System.in));
					
					
					
					BufferedReader mamlaz = new BufferedReader (new InputStreamReader(System.in));
					
					
					
					System.out.println("Unesite vrednost površine poprečnog preseka štapa A: ");
					A = Double.parseDouble(mamlaz.readLine());
					System.out.println("Unesite vrednost dužine štapa L (cm): ");
					L = Double.parseDouble(mamlaz.readLine());
					System.out.println("Unesite vrednost modula elastičnosti E: ");
					E = Double.parseDouble(mamlaz.readLine());
					System.out.println("Unesite vrednost izduženja štapa (cm):");
					deltaL = Double.parseDouble(mamlaz.readLine());
					System.out.println("Unesite vrednost kontrakcije (cm): ");
					deltaA = Double.parseDouble(mamlaz.readLine());
					
					
					F = A * E * deltaL / L;
					mi = L * deltaA / (A * deltaL);
					//poslednja linija koda
					System.out.println("Intenzitet aksijalne sile je F = " + df.format(F) + "kN\nVrednost Poasonovog koeficijenta je " + df.format(mi)+"." );
	}

}
