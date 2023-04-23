package UUP;

import java.io.*;
import java.text.DecimalFormat;
//import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) throws Exception {
		
				//napisati pr kojim se izracunava funkcija
		
				//unesemo vrednost x i izracunamo y
				// y =
				DecimalFormat df = new DecimalFormat("#.#######");
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				//Scanner ulaz = new Scanner(System.in);
				//BufferedReader ulaz = new BufferedReader( new InputStreamReader(System.in));
				double x,y;
				System.out.println("Unesite vrednost za x:");
				//x = ulaz.nextDouble();
				x = Double.parseDouble(ulaz.readLine());
				y=	Math.sqrt((Math.exp(x/2) + 1.2 * Math.sin(2*x))/(3.3 * Math.cos(x)- 7.1 * Math.exp(x)));
				System.out.println("Vrednost y je: " + df.format(y));
				ulaz.close();
				
				
	}

}
