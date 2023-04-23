package david.koljukaj;

import java.io.*;

public class Zadatak6 {

	public static void main(String[] args) throws Exception {
				//Napisati naredbe kojima se za dato n izracunava faktorijal prirodnog broja
				// n: fakt = n! = 1*2*3*...*n
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int broj,fakt=1;
		
		System.out.println("Unesite jedan broj: ");
		broj = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1; i<=broj; i++)
		{
			fakt = i * fakt;
			
		}
		System.out.println("Faktorijal unetog broja je: "+ fakt);
	}

}
