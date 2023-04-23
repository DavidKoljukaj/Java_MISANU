package david.koljukaj;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
			//Napisati program kojim se ucita znak za operaciju
			//(+,-,*,/) i dva realna operanda, a zatim 
			//stampa rezultat
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		double a,b,c;
		char znak;
		System.out.println("Unesite vrednost za a: ");
		a = input.nextDouble();
		System.out.println("Unesite vrednost za b: ");
		b = input.nextDouble();
		System.out.println("Unesite znak za operaciju nad brojevima a i b: ");
		znak = input.next().charAt(0);
		input.close();
		
		if(znak == '+') {
			c = a+b;
			System.out.println("Zbir a i b je " + df.format(c));
		}else if(znak =='-') {
			c = a-b;
			System.out.println("Razlika a i b je " + df.format(c));
		}else if(znak == '*') {
			c = a*b;
			System.out.println("Proizvod a i b je " + df.format(c));
		}else if(znak == '/') {
			c = a/b;
			System.out.println("Količnik a i b je " + df.format(c));
		}else {
			System.out.println("Nepoznata operacija.");
		}
	}

}
