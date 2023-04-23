package david.koljukaj;

import java.io.*;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
			//Napisati program koji za uneti karakter stampa 
			//da li je samoglasnik ili suglasnik
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char vokal;
		//String slovo;
		
		System.out.println("Unesite jedno slovo: ");
		//slovo = br.readLine();
		vokal = br.readLine().charAt(0);
		//vokal = sc.next().charAt(0);
		br.close();
		
		
		
		switch (vokal) {
		//moze i case 'a': case 'A': {} ili case 'a' & 'A'
		case 'a':
		{
			System.out.println(vokal+" je vokal!");
		}
		break;
		case 'A':
		{
			System.out.println(vokal+" je vokal!");
		}
		break;
		case 'e':
		{
			System.out.println(vokal+" je vokal!");
		}
		break;
		case 'E':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case 'i':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case 'I':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case 'u':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case 'U':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case 'o':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case 'O':
		{
			System.out.println(vokal+" je vokal!");
		}	
		break;
		case '0':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '1':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '2':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '3':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '4':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '5':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '6':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '7':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '8':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		case '9':
		{
			System.out.println(vokal+" nije slovo, to je broj!");
		}	
		break;
		default:
		{
			System.out.println(vokal +" je suglasnik!");
		}
			break;
		}
		
		
	}

}
