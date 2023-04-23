package david.koljukaj;

import java.util.Scanner;

public class DvodimenzionalniNeparni {

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
		
		for(int i = 0;i<red;i++) {
			for(int j = 0; j<kolona;j++) {
				if(matrica[i][j]%2!=0)
					System.out.print(matrica[i][j]+" ");
			}
			
		}
		
		
		sc.close();
	}

}
