package david.koljukaj;

import java.util.Scanner;

public class SumaTrecegReda {

	public static void main(String[] args) {
			
		
		
		// Ucitavanje podataka
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		
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
				if(i==2)
					suma +=matrica[i][j];
			}
			System.out.println();
		}
		System.out.println("Suma elemenata trećeg reda je: " + suma);
		sc.close();
		}

}
