package david.koljukaj;

import java.io.*;

public class For6 {

	public static void main(String[] args)  throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		int n, faktorijal;
		faktorijal = 1; // 1 predstavlja neutral za mnozenje
		
		System.out.println("Unesite broj: ");
		n = Integer.parseInt(ulaz.readLine());
		
		for(int i =1; i <=n; i++)
		{
			faktorijal = faktorijal * i;
		}
		System.out.println("Faktorijal broja " + n + " iznosi: " + faktorijal);
	
	}

}
