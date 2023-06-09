package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak6 {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		double p = 1;
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		for (int i = 1; i <= n; i++) {
			double pom = (double) 1 / (i + 1);
			p *= (1 - pom);
		}
		System.out.println("Dobijena vrednost proizvoda je " + df.format(p));
	}
}