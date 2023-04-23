package david.koljukaj;

import java.io.*;

public class Zadatak15 {

	public static void main(String[] args) throws Exception {
					// Napisati prog. koji ucitava 10 brojeva i ispisuje koliko ima negativnih
					//nula i pozitivnih brojeva.
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int pozitivan=0,negativan=0,nula=0;
		for (int i =1; i<=20; i++)
		{
			System.out.println("Unesite " + i + ". broj: ");
			int broj = Integer.parseInt(ulaz.readLine());
			if(broj==0)
			{
				nula ++;
				
			}else if (broj>0) {
				pozitivan ++;
				
			}else if (broj<0) {
				negativan ++;
				
			}
			if(nula>1 && nula<=4) {
				System.out.println(nula + " nule");
			}else {
				System.out.println(nula + " nula");
			}
			if(pozitivan>1 && pozitivan<=4) {
				System.out.println(pozitivan + " pozitivna broja. ");
			}else if(pozitivan>=5) {
				System.out.println(pozitivan + " pozitivnih brojeva. ");
			}else if(pozitivan == 0) {
				System.out.println(pozitivan + " pozitivnih brojeva. ");
			}
			else {
				System.out.println(pozitivan + " pozitivan broj. ");
			}
			if(negativan>=2 && negativan<=4) {
				System.out.println(negativan + " negativna broja. ");
			}else if(negativan>=5) {
				System.out.println(negativan + " negativnih brojeva. ");
			}
			else {
				System.out.println(negativan + " negativan broj. ");
			}

			
			
		}
		
	}

}
