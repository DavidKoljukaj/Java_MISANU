package UUP; 
import java.util.Scanner; 
public class Max { 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Unesite vrednost za a: "); 
		double a = input.nextDouble(); 
		System.out.print("Unesite vrednost za b: "); 
		double b = input.nextDouble(); 
		System.out.println("y = " + (5 + Math.max(Math.pow(a, 2), Math.pow(b, 2)))); 
		input.close();
		
	} 
	
}