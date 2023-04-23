package UUP; 

import java.io.*;

import java.text.DecimalFormat;

//import java.util.Scanner; 

public class Primer16 { 
	public static void main(String[] args) throws Exception { 
		
		//Scanner input = new Scanner(System.in);
		BufferedReader input = new BufferedReader ( new InputStreamReader(System.in));
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		double h,m;
		System.out.print("Unesite visinu osobe: "); 
		//double h = input.nextDouble(); 
		h = Double.parseDouble(input.readLine());
		System.out.print("Unesite masu osobe: "); 
		//double m = input.nextDouble(); 
		m = Double.parseDouble(input.readLine());
		System.out.println("Indeks telesne mase BMI = " + df.format(m / Math.pow(h, 2))); 
		input.close(); 
		} 
	}