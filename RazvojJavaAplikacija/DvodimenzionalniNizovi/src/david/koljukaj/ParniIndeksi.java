package david.koljukaj;

import java.util.Scanner;

public class ParniIndeksi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite broj redova matrice A:");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona matrice A: ");
		int kolona = sc.nextInt();
		
		int [][] matrica = new int [red][kolona];
		for(int i =0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print("A[" + i + ","+j+"]"+"=");
				matrica[i][j]=sc.nextInt();
				
				
			}
		}
		
		System.out.println("Elementi matrice sa parnim indeksima redova su: ");
		for(int i = 0;i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				// if ((i+1)%2==0) za parne redove!!!
				if(i%2==0)
					System.out.print(matrica[i][j] + " ");
			}
			
		}
		
		// 1. red je neparan
		// 2. red je paran
		// 3. red je neparan
		sc.close();
	}

}
