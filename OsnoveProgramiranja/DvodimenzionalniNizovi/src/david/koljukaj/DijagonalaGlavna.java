package david.koljukaj;

import java.util.Scanner;

public class DijagonalaGlavna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite broj redova kvadratne matrice A:");
		int red = sc.nextInt();
		int kolona = red;
		
		int [][] matrica = new int [red][kolona];
		for(int i =0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print("A[" + i + ","+j+"]"+"=");
				matrica[i][j]=sc.nextInt();
				
				
			}
		}
		
		System.out.println("Elementi glavne dijagonale su: ");
		for(int i = 0;i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				
				if(i==j)
					System.out.print(matrica[i][j] + " ");
			}
			
		}
		sc.close();
	}

}
