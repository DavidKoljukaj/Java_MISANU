package UUP;

import java.util.Scanner;

public class BrojPrimer14 {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				int broj,j,d,s,rezultat;
				
				System.out.println("Unesite trocifreni broj: ");
				broj =input.nextInt();
				
				j=broj%10;
				d=(broj/10);
				d=d%10;
				s=broj/100;
				
				if(j>d) {
					int t=j;
					j=d;
					d=t;
				}
				if(j>s) {
					int t =j;
					j=s;
					s=t;
				}
				
				if(d>s) {
					int t=d;
					d=s;
					s=t;
				}
				
				rezultat = s*100+d*10+j;
				System.out.println("Rezultat: " + rezultat);
				input.close();
	}

}
