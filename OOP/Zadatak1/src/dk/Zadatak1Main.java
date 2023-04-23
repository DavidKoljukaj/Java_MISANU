package dk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak1Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite sate: ");
		int sati = Integer.parseInt(br.readLine());
		System.out.println("Unesite minute: ");
		int min = Integer.parseInt(br.readLine());

		boolean s = sati < 17 && sati >= 9;

		if (s)
			System.out.println("Da");
		else
			System.out.println("Ne");

		br.close();

	}

}
