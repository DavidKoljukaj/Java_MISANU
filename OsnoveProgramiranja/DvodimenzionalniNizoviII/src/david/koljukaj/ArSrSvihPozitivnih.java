package david.koljukaj;

import java.util.Scanner;

public class ArSrSvihPozitivnih {

	public static void main(String[] args) {
			
		
		
		// Ucitavanje podataka
		Scanner sc = new Scanner(System.in);
		
		int suma = 0,brojac=0;
		double sredina;
		
		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();
		
		System.out.println("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		// "matrica" - naziv vaseg dvodimenzionalnog niza
		int [][] matrica = new int [red][kolona];
		
		System.out.println("Unesite elemente: ");
		
		for(int i =0;i<red;i++) {
			for(int j =0;j<kolona;j++) {
				System.out.print("A[" + i + "," + j + "]=");
				matrica[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for(int i = 0; i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print(matrica[i][j] + " ");
				if(matrica[i][j]>0) {
					suma +=matrica[i][j];
					brojac++;}
			}
			System.out.println();
		}
		sredina = (double)suma/brojac;
		System.out.println("Aritmetička sredina svih elemenata je: " + sredina);
		sc.close();
		}

}
