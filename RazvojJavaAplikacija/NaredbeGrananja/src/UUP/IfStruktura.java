package UUP;  
import java.io.*;  
public class IfStruktura { 
	public static void main(String[] args) throws Exception { 
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Unesite vrednost za x: "); 
		int x = Integer.parseInt(ulaz.readLine()); 
		System.out.print("Unesite vrednost za y: "); 
		int y = Integer.parseInt(ulaz.readLine()); 
		System.out.print("Unesite vrednost za p: "); 
		int p = Integer.parseInt(ulaz.readLine()); 
		System.out.print("Unesite vrednost za q: "); 
		int q = Integer.parseInt(ulaz.readLine()); 
		//int f = (p < q) ? p : q; 
		
		//if (y > f) 
			//f = y; 
		
		//if (x < f) 
			//f = x; 
		int f = Math.min(x,Math.max(y,Math.min(p,q)));
			System.out.println("Vrednost funkcije f je " + f);
		
		
	}
	
}