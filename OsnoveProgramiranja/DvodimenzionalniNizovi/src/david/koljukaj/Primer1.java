package david.koljukaj;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {
			// Ucitati elemente dvodimenzionalnog niza, a zatim ispisati:
			// a) sve elemente dvodimenzionalnog niza
			// b) elemente prvog reda
			// c) elemente druge kolone
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite broj redova matrice A:");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona matrice A: ");
		int kolona = sc.nextInt();
		
		int [][] matrica = new int [red][kolona];
		for(int i =0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print("a[" + i + ","+j+"]"+"=");
				matrica[i][j]=sc.nextInt();
				
			}
				
		}
		
		// Ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for(int i = 0; i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				System.out.print(matrica[i][j]+" ");
			
				
			}
			System.out.println();
		}
		sc.close();
	}

}
