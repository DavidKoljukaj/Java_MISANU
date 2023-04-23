package dk;

public class LambdaIzraz3 {

	public static void main(String[] args) {

		OkreniString os = (str) -> {
			String rezultat = "";

			for (int i = str.length() - 1; i >= 0; i--)
				rezultat += str.charAt(i);
			return rezultat;
		};

		System.out.println("Proveri " + os.OkreniString("Proveri"));
		System.out.println("Java obrnuto " + os.OkreniString("Java"));

	}

}
