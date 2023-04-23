package UUP;

import java.io.*;
import java.text.DecimalFormat;

public class Primer13 {

	public static void main(String[] args)  throws Exception {
			// n - dijagonala ekrana izrazena u inchima
			double n;
			
			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			DecimalFormat df = new DecimalFormat("#.######");
			
		
			// Unos dijagonale ekrana izrazene u inchima
			System.out.println("Unesite duzinu dijagonale ekrana u inchima: " );
			n = Double.parseDouble(ulaz.readLine());
			
			// Stampanje rezultata
			System.out.println("Dijagonala ekrana u cm je " + df.format(n * 2.54) );
			ulaz.close();
			
	}

}
