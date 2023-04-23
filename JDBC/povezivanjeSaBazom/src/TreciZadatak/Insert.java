package TreciZadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3307/bib";
		String username = "root";
		String password = "";

		System.out.println("Povezivanje...");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesno ste se povezali sa bazom.");

			String insert = "INSERT INTO biblioteke(ime,ulica,broj)VALUES(?,?,?)";

			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, "Biblioteka Grada");
			ps.setString(2, "Knez Mihajlova");
			ps.setString(3, "100");

			int unos = ps.executeUpdate();

			if (unos > 0) {
				System.out.println("Uspesno ste uneli podatke u tabelu.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
