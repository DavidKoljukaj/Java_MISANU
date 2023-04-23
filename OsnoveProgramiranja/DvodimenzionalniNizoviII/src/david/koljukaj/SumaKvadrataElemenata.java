package david.koljukaj;

import java.util.Scanner;

public class SumaKvadrataElemenata {

	public static void main(String[] args) {
			
		
		
		// Ucitavanje podataka
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int red=0,kolona=0;
		do {
		System.out.println("Unesite broj redova: ");
		red = sc.nextInt();
		
		System.out.println("Unesite broj kolona: ");
		kolona = sc.nextInt();
		}while(red<0&&kolona<0);
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
				suma += Math.pow(matrica[i][j], 2);
			}
			System.out.println();
		}
		System.out.println("Suma kvadrata svih elemenata "
				+ "dvodimenzionalnog niza je: " + suma);
		sc.close();
		}

}
