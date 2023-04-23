package david.koljukaj;

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {
				Scanner ulaz = new Scanner(System.in);
				int b =1,s=0,i=0; //Boolean b = true;
				
				
					while (i < 10 && b != 0) { 
						System.out.println("Unesite vrednost broja:"); 
						int br = ulaz.nextInt(); 
						if (br == 0) 
							b = 0; //moze i Boolean b = false
						else if (br % 2 == 0) { 
						s += br; i++; 
						} } if (b == 1) 
						System.out.println("Sumirano je 10 parnih brojeva"); 
						else 
						System.out.println("Korisnik je uneo cifru 0"); 
						System.out.println("i = " + i + " s = " + s); 
						ulaz.close(); 
				
	}

}
