package david.koljukaj;

import java.io.*;

public class Zadatak11 {

	public static void main(String[] args) throws Exception {
					//Napisati prog. kojim se stampaju Armstrongovi brojevi.
					//Broj je Armstrongov ako je jednak zbiru kubova svojih cifara
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int x,jedinica,desetica,stotica;
		
		System.out.println("Unesite broj: ");
		x = Integer.parseInt(ulaz.readLine());
		
		jedinica = x%10;
		desetica = (x/10)%10;
		stotica = x/100;
		
		for (int i =100; i<1000; i++)
		{
		
		if(x == jedinica*jedinica*jedinica + desetica*desetica*desetica + stotica*stotica*stotica ) {
			System.out.println("Broj " + x + " je Armstrongov broj. ");
			
		}else {
			System.out.println("Broj " + x + " nije Armstrongov broj. ");
		}
		}
		ulaz.close();
	}

}
