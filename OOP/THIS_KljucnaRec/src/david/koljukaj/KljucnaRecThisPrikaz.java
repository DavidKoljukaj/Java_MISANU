package david.koljukaj;

public class KljucnaRecThisPrikaz {

	public static void main(String[] args) {
		/*
		 * This * * Kljucna rec this ili referenca this pruza nacin da metoda zna koji
		 * tacno objekat je pozvao metodu, tj sa cijim podacima radi. * Takodje, moze se
		 * koristiti za pristup podacima objekta koji su sakriveni lokalnim
		 * promenljivama ili parametrima metode. * * Takodje, odnosi se na trenutni
		 * objekat u metodi ili konstruktoru.
		 */

		Circle c1 = new Circle();
		Circle c2 = new Circle(5);

		System.out.println("Prvi krug ima površinu: " + c1.povrsina() + "\nDrugi krug ima površinu: " + c2.povrsina());
	}

}
