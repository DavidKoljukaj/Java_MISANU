
package Enum;

public class Enum5Main {

	public static void main(String[] args) {

		Pitanja q = new Pitanja();
		EnumPrikaz e = new EnumPrikaz();

		System.out.println(q.odg());
		System.out.println(q.odg());
		System.out.println(q.odg());

		e.odgovor(q.odg());
	}

}
