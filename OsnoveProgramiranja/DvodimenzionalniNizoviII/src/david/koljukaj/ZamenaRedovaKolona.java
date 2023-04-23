package david.koljukaj;

import java.util.Scanner;

public class ZamenaRedovaKolona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite broj redova matrice A:");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona matrice A:");
		int kolona = sc.nextInt();
		
		
		
		int [][] matricaA = new int [red][kolona];
		
		
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
		for (int i = 0; i<kolona;i++) {	// 
			for(int j = 0;j<red;j++) {
				System.out.print(matricaA[j][i] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
