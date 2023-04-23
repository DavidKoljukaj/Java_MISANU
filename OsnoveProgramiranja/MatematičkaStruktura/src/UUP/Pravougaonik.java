package UUP; 
import java.util.Scanner; 
public class Pravougaonik { 
	public static void main(String[] args) { 
		//a, b - stranice pravouganika
		Scanner input = new Scanner(System.in); 
		System.out.println("Unesite vrednost stranice pravougaonika a: "); 
		double a = input.nextDouble(); 
		System.out.println("Unesite vrednost stranice pravougaonika b: ");
		double b = input.nextDouble(); 
		//PRVI NACIN (prakticnij)
		//System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b));
		//ili DRUGI NACIN (moze bilo koji i bice na testu!!!)
		double d = Math.sqrt(a*a+b*b);
		System.out.println("Dijagonala pravougaonika je: " + d);}}