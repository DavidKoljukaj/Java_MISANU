package david.koljukaj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer8 {

	public static void main(String[] args) throws Exception{
				int [] bj = new int [10];
				int [] bd = new int [10];
				int broj,m,k;
				
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				
				for(int i = 0; i<=9;i++) {
					bj[i]=0;
					bd[i]=0;
				}
				
				System.out.println("Koliko brojeva zelite da unestet? ");
				int n = Integer.parseInt(ulaz.readLine());
				
				System.out.println("Unesite brojeve: ");
				for(int i =1; i<=n;i++ ) {
					broj=Integer.parseInt(ulaz.readLine());
					
					if(broj>=0&&broj<=99) {
						if(broj<10)
							m=broj;
						else {
							k=broj/10;
							bd[k]++;
							m=broj-10*k;
						}
							bj[m]++;
					}
				}
				
				System.out.println("\tCifra\tKao desetica\tKao jedinica ");
				for(int i =0;i<=9;i++)
					System.out.println("\t" + i + "\t" + bd[i] + "\t" + bj[i]);
	}

}
