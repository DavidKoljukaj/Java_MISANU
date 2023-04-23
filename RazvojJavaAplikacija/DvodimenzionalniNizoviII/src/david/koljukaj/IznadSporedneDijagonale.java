package david.koljukaj;

public class IznadSporedneDijagonale {

	public static void main(String[] args) {
			
		int [][] matrica = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
			//int [][] matrica = new int [5][5];
			//int [][] matricaIspod = new int [red][kolona];
			
			
			//Stampanje originalne matrice
			System.out.println("Početni elementi: ");
			for(int i = 0;i<5;i++) {
				for(int j =0;j<5;j++) {
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			
			//Stampanje matrice iznad sporedne dijagonale
			System.out.println("Elementi na i iznad sporedne dijagonale: ");
			for(int i = 0;i<5;i++) {
				for(int j =4;j>=i;j--) {
					if(i==j||j>i)
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			
	}

}
