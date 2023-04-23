package UUP;

import java.io.*;

public class TernarnaStruktura {

	public static void main(String[] args) throws Exception{
				//Deklarisanje podataka
				double x,y;
				
				BufferedReader ulaz = new BufferedReader (new InputStreamReader(System.in));
	
				//Unos podatka x
				System.out.println("Unesite vrednost za X: ");
				x = Double.parseDouble(ulaz.readLine());
				
				//Primena uslovnog operatora
				y = (x>=0)?x: -x;
				
				//Stampanje rezultata
				System.out.println("Za uneto X = " + x + " dobija se Y = " + y);
	}

}
