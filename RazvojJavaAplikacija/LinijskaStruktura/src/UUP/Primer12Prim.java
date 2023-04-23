package UUP;

import java.io.*;

public class Primer12Prim {

	public static void main(String[] args) throws Exception {
					// n-trocifreni broj
					// s - cifra stotice
					// d - cifra desetice
					// j - cifra jedinice
					// zbir - zbir cifara trocifrenog broja
					int n,s,d,j,zbir;
					BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
					
					// Unos trocifrenog broja
					System.out.println("Unesite trocifreni broj n: ");
					n = Integer.parseInt(input.readLine());
					// Nalazenje cifara trocifrenog broja
					s = n / 100;
					d = (n % 100) / 10;
					j = n % 10;
				
					// Izracunavanje zbira cifara trocifrenog broja
					zbir = s + d + j;
					// Stampanje rezultata
					System.out.println("Zbir cifara trocifrenog broja " + n + " je " + zbir + ".");
					input.close();
	}

}
