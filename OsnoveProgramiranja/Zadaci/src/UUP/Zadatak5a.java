package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak5a {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za a: ");
		int a = Integer.parseInt(ulaz.readLine());
		if (a > 0) {
			System.out.print("Unesite vrednost za n: ");
			int n = Integer.parseInt(ulaz.readLine());
			double x0 = (a + n - 1) / n;
			double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
			while (Math.abs(x1 - x0) > 1.0E-5) {
				x0 = x1;
				x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
			}
			System.out.println("Dobijena vrednost je x = " + df.format(x1));
		} else
			System.out.println("Vrednost za a mora biti veća od nule.");
	}
}