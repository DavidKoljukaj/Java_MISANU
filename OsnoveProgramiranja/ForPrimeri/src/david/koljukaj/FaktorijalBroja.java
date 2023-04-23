package david.koljukaj;

public class FaktorijalBroja {

	public static void main(String[] args) {
			
		int n=6,faktorijal = 1;
		for (int i=1; i<=n;i++)
		{
			faktorijal *= i;
		}
		System.out.println(faktorijal);
	}

}
