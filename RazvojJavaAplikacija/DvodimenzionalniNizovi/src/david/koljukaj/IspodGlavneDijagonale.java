package david.koljukaj;

import java.util.Scanner;

public class IspodGlavneDijagonale {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int red,kolona;
			
			System.out.println("Unesite broj redova kvadratne matrice A:");
			 red = sc.nextInt();
			 kolona = red;
			int [][] matrica = new int [red][kolona];
			//int [][] matricaIspod = new int [red][kolona];
			
			for(int i = 0;i<red; i++) {
				for(int j = 0; j<kolona;j++) {
					System.out.print("A[" + i + ", " + j + "]=");
					matrica[i][j]=sc.nextInt();
				}
			}
			//Stampanje originalne matrice
			System.out.println("Kvadratna matrica A: ");
			for(int i = 0;i<red;i++) {
				for(int j =0;j<kolona;j++) {
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			
			//Stampanje matrice ispod glavne dijagonale
			System.out.println("Elementi na i ispod glavne dijagonale: ");
			for(int i = 0;i<red;i++) {
				for(int j =0;j<kolona;j++) {
					if(i==j||j<i)
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			sc.close();
	}

}
