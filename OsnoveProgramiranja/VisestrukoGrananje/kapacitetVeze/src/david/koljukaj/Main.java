package david.koljukaj;

import java.io.*;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {
			//Napisati program koji za nalazenje ekvivalentnog
			//kapaciteta dva kondenzatora kapaciteta C1=10nF
			//i C2=15nF ako su vezana:
			//a)Redno
			//b)Paralelno
		//Resenje: Ekvivalentni kapacitet redne veze izrachunava
		//se po formuli Ce=C1*C2/(C1+C2), a paralelne veze po
		//formuli Ce=C1+C2
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		//double C1 = 10,C2 =15,Ce,Cp;
		double C1,C2,Ce;
		int X;
		System.out.println("Unesite kapacitet prvog kondenzatora C1: ");
		C1 = Double.parseDouble(input.readLine());
		System.out.println("Unesite kapacitet drugog kondenzatora C2: ");
		C2 = Double.parseDouble(input.readLine());
		System.out.println("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu");
		X = Integer.parseInt(input.readLine());
		input.close();
		
		switch (X) {
		case 1:
		{
			Ce=C1*C2/(C1+C2);
			System.out.println("Kapacitet redne veze Ce = " + df.format(Ce));
		}
		break;
		case 2:
		{
			Ce=(C1+C2);
			System.out.println("Kapacitet paralelne veze Ce = " + df.format(Ce));
		}
			break;

		default:
		{
			System.out.println("Unesite vrednost 1 ili 2.");
		}
			break;
		}
		}
		
	}


