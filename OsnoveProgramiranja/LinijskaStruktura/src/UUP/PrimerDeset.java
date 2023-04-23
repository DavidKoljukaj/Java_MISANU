package UUP;

import java.io.*;


public class PrimerDeset {

	public static void main(String[] args) throws Exception {
				double a,P,V;
				BufferedReader ulaz = new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Unesite vrednost za a: " );
				a = Double.parseDouble(ulaz.readLine());

				P = 6 * Math.pow(a, 2);
				V = Math.pow(a, 3);
				System.out.println("Za unetu stranicu kocke a= " + a + " izracunata povrsina je " + P + " ,a zaprenina " + V);
				ulaz.close();
	}

}
