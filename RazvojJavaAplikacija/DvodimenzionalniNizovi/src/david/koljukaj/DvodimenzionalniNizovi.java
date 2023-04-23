package david.koljukaj;

public class DvodimenzionalniNizovi {

	public static void main(String[] args) {
					
			
			//I nacin: Inicijalizacija dvodimenzionalnog niza
		int[][] a = { {10,40,70},{20,50,80},{30,60,90}};
		
		// Stampanje elemenata dvodimenzionalnog niza
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(a[j][i] + " ");
			}
		System.out.println();	
			
			
		}
	}

}
