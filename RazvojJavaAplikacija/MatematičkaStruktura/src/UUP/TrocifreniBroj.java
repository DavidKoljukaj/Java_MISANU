package UUP;

import java.util.Scanner;

public class TrocifreniBroj {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Trocifren broj: ");
	int broj = input.nextInt();
	
	int s,d,j;
	
	s = broj / 100; // cifre stotina
	d = (broj / 10) % 10; // cifra desetica
	j = broj % 10; // cifra jedinica
	
	System.out.println("broj =" + broj + ", cifra stotica = " + s + ", cifra desetica je = " + d + ", a cifra jedinica je : " + j );

	}

}
