import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int ocena;
				System.out.println("Unesite ocenu: ");
				ocena = sc.nextInt();
				sc.close();
				
				switch(ocena) 
				{
				case 5:
				{
					System.out.println("Odličan");
					break;
				}
				case 4:
				{
					System.out.println("Vrlo dobar");
					break;
				}
				case 3:
				{
					System.out.println("Dobar");
					break;
				}
				case 2:
				{
					System.out.println("Dovoljan");
					break;
				}
				case 1:
				{
					System.out.println("Nedovoljan");
					break;
				}
				default:
				{
					System.out.println("Ocene se kreću od jedan do pet.");
				}
				}
	}

}
