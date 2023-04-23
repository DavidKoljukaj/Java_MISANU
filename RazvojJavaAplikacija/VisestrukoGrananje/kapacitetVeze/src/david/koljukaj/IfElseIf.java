package david.koljukaj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class IfElseIf {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		double C1,C2,Ce;
		int X;
		System.out.println("Unesite kapacitet prvog kondenzatora C1: ");
		C1 = Double.parseDouble(input.readLine());
		System.out.println("Unesite kapacitet drugog kondenzatora C2: ");
		C2 = Double.parseDouble(input.readLine());
		System.out.println("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu");
		X = Integer.parseInt(input.readLine());
		input.close();
		
		if(X==1) {
			Ce=C1*C2/(C1+C2);
			System.out.println("Kapacitet redne veze Ce = " + df.format(Ce));
		}else if(X==2) {
			Ce=(C1+C2);
			System.out.println("Kapacitet paralelne veze Ce = " + df.format(Ce));
		}else {
			System.out.println("Unesite vrednost 1 ili 2.");
		}
	}

}
