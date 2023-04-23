package david.koljukaj;

import java.util.Scanner;

public class ZamenaRedovaKolona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite broj redova kvadratne matrice A:");
		int red = sc.nextInt();
		int kolona = red;
		
		
		int [][] matricaA = new int [red][kolona];
		int [][] matricaB = new int [red][kolona];
		
		for(int i =0;i<red;i++) {
			for(int j=0;j<kolona;j++) {
				System.out.print("A[" + i + ","+j+"]"+"=");
				matricaA[i][j]=sc.nextInt();
				
				
			}
		}
		System.out.println("Početni dvodimenzionalni niz:");
		for (int i = 0; i<red;i++) {
			for(int j = 0;j<kolona;j++) {
				System.out.print(matricaA[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Transponovani elementi: ");
		for (int i = 0; i<red;i++) {	// 
			for(int j = 0;j<kolona;j++) {
				matricaB[i][j] = matricaA[j][i];
				System.out.print(matricaB[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
