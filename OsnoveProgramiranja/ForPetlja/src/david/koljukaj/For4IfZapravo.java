
package david.koljukaj;

import java.io.*;

public class For4IfZapravo {

	public static void main(String[] args) throws Exception {
					BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
					int n = 0,zbir =0,prviBroj,drugiBroj,treciBroj,cetvrtiBroj;
					
					System.out.println("Koliko brojeva želite da saberete? ");
					n = Integer.parseInt(ulaz.readLine());
					
					if (n > 1 && n<= 2)
					{
						System.out.println("Unesite prvi broj: ");
						prviBroj = Integer.parseInt(ulaz.readLine());
						System.out.println("Unesite drugi broj: ");
						drugiBroj = Integer.parseInt(ulaz.readLine());
						
						
						zbir = prviBroj + drugiBroj;
						System.out.println("Zbir brojeva je: " + zbir);
						
						
					}else if (n>2 && n<=3) {
						System.out.println("Unesite prvi broj: ");
						prviBroj = Integer.parseInt(ulaz.readLine());
						System.out.println("Unesite drugi broj: ");
						drugiBroj = Integer.parseInt(ulaz.readLine());
						System.out.println("Unesite treci broj: ");
						treciBroj = Integer.parseInt(ulaz.readLine());
						zbir = prviBroj + drugiBroj+treciBroj;
						System.out.println("Zbir brojeva je: " + zbir);
					}else if (n>3 && n<=4) {
						System.out.println("Unesite prvi broj: ");
						prviBroj = Integer.parseInt(ulaz.readLine());
						System.out.println("Unesite drugi broj: ");
						drugiBroj = Integer.parseInt(ulaz.readLine());
						System.out.println("Unesite treci broj: ");
						treciBroj = Integer.parseInt(ulaz.readLine());
						System.out.println("Unesite cetvrti broj: ");
						cetvrtiBroj = Integer.parseInt(ulaz.readLine());
						
						zbir = prviBroj + drugiBroj+treciBroj+cetvrtiBroj;
						System.out.println("Zbir brojeva je: " + zbir);
					}else if(n>=5)
					{
						System.out.println("Program sabira do četiri broja.");
					}
					else
					{
						System.out.println("Unesite vise od jednog broja!");
					}
					ulaz.close();
	}

}
