package david.koljukaj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArSrParnihElPoKolonama {

	public static void main(String[] args) {
			
		
		
		// Ucitavanje podataka
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int suma = 0,brojac=0;
		double sredina=0;
		
		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();
		
		System.out.println("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		// "matrica" - naziv vaseg dvodimenzionalnog niza
		int [][] matrica = new int [red][kolona];
		
		System.out.println("Unesite elemente: ");
		
		for(int i =0;i<red;i++) {
			for(int j =0;j<kolona;j++) {
				System.out.print("A[" + i + "," + j + "]=");
				matrica[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrica: ");
		for(int i =0;i<red;i++) {
			for(int j =0;j<kolona;j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int j = 0; j<kolona;j++) {
			System.out.println((j+1)+". kolona:");
			suma=0;
			brojac=0;
			for(int i=0;i<red;i++) {
				System.out.println(matrica[i][j]);
				if(matrica[i][j]%2==0) {
					suma +=matrica[i][j];
					brojac++;}
				
				sredina = (double)suma/brojac;
			}		
			System.out.println("Aritmetička sredina svih parnih elemenata " + 
					(1+j) + ". kolone je: " + df.format(sredina));	
			
		}
		sc.close();
			}
		
		
		}


