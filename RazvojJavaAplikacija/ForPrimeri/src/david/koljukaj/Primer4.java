package david.koljukaj;

import java.io.*;
//import java.text.DecimalFormat;

public class Primer4 {

	public static void main(String[] args) throws Exception{
			//DecimalFormat df = new DecimalFormat("#.###");
			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			double suma =0;
			
			
			System.out.println("Unesite vrednost za n: ");
			int n = Integer.parseInt(ulaz.readLine());
			
			for(int i =1; i<=n;i++)
				suma +=(double)i/(i+1);
			System.out.println("Dobijena vrednost sume je " + suma);
	}

}
