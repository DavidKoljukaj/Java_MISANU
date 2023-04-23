package UUP;

import java.util.Scanner;


public class Trougao {

	public static void main(String[] args) {
					Scanner input = new Scanner(System.in);
					
					System.out.println("Unesite stranicu trougla x: ");
					int x =input.nextInt();
					System.out.println("Unesite stranicu trougla y: ");
					int y =input.nextInt();
					System.out.println("Unesite stranicu trougle z: ");
					int z =input.nextInt();
					
					boolean p = (x+y>z)&&(x+z>y)&&(y+z>x);
					
					System.out.println("p= " + p);
					input.close();
	}

}
