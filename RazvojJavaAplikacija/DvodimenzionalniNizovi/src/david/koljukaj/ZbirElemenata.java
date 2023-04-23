package david.koljukaj;

import java.util.Scanner;

public class ZbirElemenata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite broj redova dvaju matrica:");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona dvaju matrica: ");
		int kolona = sc.nextInt();
		
		int [][] matricaA = new int [red][kolona];
		int [][] matricaB = new int [red][kolona];
		int [][] matricaC = new int [red][kolona];
		
		System.out.println("Elementi prve matrice: ");
		for(int i =0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print("A[" + i + ","+j+"]"+"=");
				matricaA[i][j]=sc.nextInt();
				
				
			}
		}
		System.out.println("Elementi druge matrice: ");
		for(int i =0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print("B[" + i + ","+j+"]"+"=");
				matricaB[i][j]=sc.nextInt();
				
				
			}
		}
		// Ispisivanje elemenata
				System.out.println("Elementi dvodimenzionalnog niza A su: ");
				for(int i = 0; i<red;i++) {
					for(int j = 0;j<kolona;j++) {
						System.out.print(matricaA[i][j]+" ");
					
						
					}
					System.out.println();
				}

				// Ispisivanje elemenata
				System.out.println("Elementi dvodimenzionalnog niza B su: ");
				for(int i = 0; i<red;i++) {
					for(int j = 0;j<kolona;j++) {
						System.out.print(matricaB[i][j]+" ");
					
						
					}
					System.out.println();
				}
		for(int i = 0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				matricaC[i][j]=matricaA[i][j]+matricaB[i][j];
			}
		}
		// Ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza C su: ");
		for(int i = 0; i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				System.out.print(matricaC[i][j]+" ");
		
			
		
			}
			System.out.println();
		}
		sc.close();
	}}


