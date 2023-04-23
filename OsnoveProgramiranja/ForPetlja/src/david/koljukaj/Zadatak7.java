package david.koljukaj;

import java.io.*;

public class Zadatak7 {

	public static void main(String[] args) throws Exception {
				//Napisati program kojim se za date prirodne brojeve m i n, izracunava:
				// S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		double m=1,n=1,S=0,i;
		
		System.out.println("Unesite jedan broj n = ");
		n = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite drugi broj m = ");
		m = Double.parseDouble(ulaz.readLine());
		for(i=1; i<=m*m; i++)
		{
			S = S + n * (n + i*m)	;  //!!!! greska!!!! >>> S = n*(n+i*m)
		}
		System.out.println(S);
		ulaz.close();
	}

}
