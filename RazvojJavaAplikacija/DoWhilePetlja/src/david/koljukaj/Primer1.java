package david.koljukaj;

import java.io.*;

//import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args)throws Exception {
			//Scanner ulaz = new Scanner(System.in);
			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			double suma=0;
			System.out.println("Unesite vrednost za n: ");
			int n = Integer.parseInt(ulaz.readLine());
			ulaz.close();
			for(int i =1;i<=n;i++)
				suma += (double)i/(i+1);
			
			System.out.println("Dobijena vrednost sume je " + suma);
	}

}
