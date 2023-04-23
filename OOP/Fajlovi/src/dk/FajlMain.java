package dk;

import java.io.File;

public class FajlMain {

	public static void main(String[] args) {

		File f = new File("D:/david.java");

		System.out.println("Fajl: " + f.getName() + (f.isFile() ? " je fajl " : " nije fajl"));
		System.out.println("Apsolutna putanja: " + f.getAbsolutePath());
		System.out.println(f.exists() ? "Fajl postoji " : "Fajl ne postoji ");
		System.out.println(f.isDirectory() ? "Je direktorij " : "Nije direktorij");
		System.out.println(f.canRead() ? "Fajl moze biti procitan " : "Fajl ne moze biti procitan");
		System.out.println(f.canWrite() ? "U fajl se moze upisivati " : "U fajl se ne moze upisivati");
		System.out.println("Velichina: " + f.length());
		System.out.println("Poslednja promena fajla :" + f.lastModified());

	}

}
