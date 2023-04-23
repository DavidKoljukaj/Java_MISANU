package david.koljukaj;

import java.io.*;

public class Zadatak10 {

	public static void main(String[] args) throws Exception{
				//U zadatom intervalu ispitati i ispisati sve brojeve deljive sa brojem 3
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int broj;
		System.out.println("Unesite interval: ");
		broj = Integer.parseInt(ulaz.readLine());
		
		for (int i =1; i<=broj; i ++)
		{
			if(i%3 ==0)
			{
				System.out.println(i);
			}
		}
	}

}
