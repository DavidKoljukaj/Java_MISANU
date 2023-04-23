package david.koljukaj;

import java.io.*;

public class For7 {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int m,n,S=0;
		System.out.println("Unesite prvi broj: ");
		m = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite drugi broj: ");
		n = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1 ; i <= m; i++)
		{
			S = S + n * (n + i*m);
		}
		System.out.println("Suma iznosi: " + S);
	}

}
