package david.koljukaj;

import java.util.Scanner;

public class SumaVecihOd3 {

	public static void main(String[] args) {
			
		
		
		// Ucitavanje podataka
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		
		
		
		// "matrica" - naziv vaseg dvodimenzionalnog niza
		int [][] matrica = new int [5][5];
		
		System.out.println("Unesite elemente kvadratne matrice 5X5: ");
		
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				System.out.print("A[" + i + "," + j + "]=");
				matrica[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for(int i = 0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrica[i][j] + " ");
				if(matrica[i][j]>3)
					suma +=matrica[i][j];
			}
			System.out.println();
		}
		System.out.println("Suma svih elemenata većih od tri je: " + suma);
		sc.close();
		}

}
