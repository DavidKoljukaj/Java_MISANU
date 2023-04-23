package david.koljukaj;

//import java.io.*;
import java.text.DecimalFormat;

public class Primer1 {

	public static void main(String[] args) throws Exception {
				/* S = suma od n-1 do 50 n+2.5 / n na drugi + 1.2
				 * 
				 * 
				 */
		DecimalFormat df = new DecimalFormat("#.###");
		
		double S=0;
		
		
		for(int n=1; n<=50; n++)
		{
			S += (n + 2.5) / (n * n + 1.2);
		}
		 // Štampanje izlaznog rezultata 
		System.out.println("Dobijena vrednost sume je " + df.format(S));
	}

}
