package UUP;

public class Logarithm {

	public static void main(String[] args) {

		double s1 = 0, s2 = 0;
		double[] x = { 4, 2, 3, 5 };

		for (int i = 0; i <= 3; i++) {
			s1 += Math.log(x[i]);
			s2 += Math.log(x[i]) * Math.log(x[i]);
		}

		System.out.println("s1 na kvadrat: " + Math.pow(s1, 2) + "\ns2 je:" + s2);

	}

}
