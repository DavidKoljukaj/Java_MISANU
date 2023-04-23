package UUP;

import java.io.*;
import java.text.DecimalFormat;

public class IfElseStruktura  {

	public static void main(String[] args) throws Exception {
		double x,y;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Unesite vrednost za x:");
		x = Double.parseDouble(ulaz.readLine());
		
		
		if(x>=0)
			y=x;
		else
			y=-x;
		
		System.out.println("Za uneto X = " + df.format(x) + " dobija se Y = " + df.format(y));
		ulaz.close();
			}

}
	
