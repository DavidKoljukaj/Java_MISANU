package david.koljukaj;

public class For3 {

	public static void main(String[] args) {
			//Napisati prog. za racunanje zbira brojeva do 10
		
		int zbir = 0; // predstavlja neutral prilikom sabiranja
		for (int x = 1; x <=10; x++)
		{
			zbir = zbir + x; // zbir += x;
			
		}
		System.out.println("Zbir brojeva iznosi: " + zbir);
	}

}
