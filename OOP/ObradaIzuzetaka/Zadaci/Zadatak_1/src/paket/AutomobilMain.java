package paket;

import java.io.IOException;

public class AutomobilMain {
	public static void main(String[] args) throws IOException {
// Kreiranje objekta klase Automobil 
		Automobil auto = new Automobil();
// Unos podataka o automobilu 
		auto.unetiNazivAutomobila();
		auto.unetiProizvodjacaAutomobila();
		auto.unetiGodisteAutomobila();
		auto.unetiPotrosnjuAutomobila();

// Štampanje podataka o automobilu 
		System.out.println("\nUneti podaci o automobilu su: ");
		System.out.println(auto.toString());
	}
}