package UUP;

import java.io.*;


public class Primer12 {

	public static void main(String[] args) throws Exception {
		
		//1 ulaz - ucitati trocifreni broj n
		//2 obrada - izracunavanje vrednosti 
		// s = n/100  d = (n-s*100)/10  j = n - s * 100 - d * 10  zbir = s+d+j
		//3 izlaz n, zbir
		
		//n - trocifreni broj
		//s - cifra stotice
		//d - cifra desetice
		//j - cifra jedinice
		//zbir - zbir cifara trocifrenog broja
		int n,s,d,j,zbir;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		//Unos trocifrenog broja
		
		System.out.println("Unesite trocifreni broj n: ");
		n = Integer.parseInt(ulaz.readLine());
		
		//Nalazenje cifara trocifrenog broja
		s = n / 100;
		d = (n-s * 100)/10;
		j = n-s * 100 - d * 10;
		//Izracunavanje zbira cifara trocifrenog broja
		zbir = s+d+j;
		//Stampanje rezultata
		System.out.println("Zbir cifara trocifrenog broja " + n + " je " + zbir + ".");
		ulaz.close();		
	}

}
