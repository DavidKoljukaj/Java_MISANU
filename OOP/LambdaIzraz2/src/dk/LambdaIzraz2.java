package dk;

public class LambdaIzraz2 {

	public static void main(String[] args) {

		ProveraDeljivosti pd = (n, m) -> (n % m) == 0;

		if (pd.test(-3, 2))
			System.out.println("Prvi broj je deljiv drugim brojem.");
		else
			System.out.println("Prvi broj nije deljiv drugim brojem.");
	}

}
