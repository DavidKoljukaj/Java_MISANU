package david.koljukaj;

import java.io.*;

public class For4 {

	public static void main(String[] args) throws Exception {
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Koliko brojeva zelite da saberete? ");
				int brojSabiraka = Integer.parseInt(ulaz.readLine());
				
				int zbir = 0;
				
				for (int i = 1; i <=brojSabiraka; i++)
				{
					System.out.println("Unesite " + i + ". broj: ");
					int sabirak = Integer.parseInt(ulaz.readLine());
					zbir = zbir + sabirak;
				}
				
				System.out.println("Zbir brojeva iznosi: " + zbir);
	}

}
