package david.koljukaj;

public class IspodGlavneDijagonale {

	public static void main(String[] args) {
			
			
			int [][] matrica = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
			
			//Stampanje originalne matrice
			System.out.println("Kvadratna matrica A: ");
			for(int i = 0;i<5;i++) {
				for(int j =0;j<5;j++) {
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			
			//Stampanje matrice ispod glavne dijagonale
			System.out.println("Elementi na i ispod glavne dijagonale: ");
			for(int i = 0;i<5;i++) {
				for(int j =0;j<5;j++) {
					if(i==j||j<i)
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
			
	}

}
