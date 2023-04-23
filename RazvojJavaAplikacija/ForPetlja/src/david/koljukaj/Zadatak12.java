package david.koljukaj;

public class Zadatak12 {

	public static void main(String[] args) {
					//Napisati program koji prebrojava brojeve od 1 do 20 koji su deljivi brojem 3
		int n = 0;
		for(int i=1; i<=20; i++)
		{
			if (i%3 == 0)
			{		
				n = n + 1;	
			}
			
		}
		System.out.println(n);
	}

}
