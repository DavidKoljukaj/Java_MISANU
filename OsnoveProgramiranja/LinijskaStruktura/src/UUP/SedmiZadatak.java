package UUP;

import java.io.*;
import java.text.DecimalFormat;

public class SedmiZadatak {

	public static void main(String[] args) throws Exception {
		
				
				
				BufferedReader ulaz = new BufferedReader( new InputStreamReader(System.in));
				DecimalFormat df = new DecimalFormat("#.###");
				double a,b,c,La,ma;
				System.out.println("Unesite vrednost za a:");
				a = Double.parseDouble(ulaz.readLine());
				System.out.println("Unesite vrednost za b:");
				b =	Double.parseDouble(ulaz.readLine());
				System.out.println("Unesite vrednost za c:");
				c = Double.parseDouble(ulaz.readLine());
				ma = 1 / 2 * Math.sqrt(2*(Math.pow(b, 2)+Math.pow(c, 2))-Math.pow(a,2));
				//La = (1/(b+c))*Math.sqrt(2*(b*b + c*c))-a*a;
				La = (1/(b+c))*Math.sqrt(b * c * (Math.pow(b + c, 2)) - Math.pow(a, 2));
				System.out.println("Duzina simetrale ugla iz temena A = " + df.format(La) );
				System.out.println("Duzina m simetrale stranice a = " + df.format(ma) );
				ulaz.close();
				
				
	}

}