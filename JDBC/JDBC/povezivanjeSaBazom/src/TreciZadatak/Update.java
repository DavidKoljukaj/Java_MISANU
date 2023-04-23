package TreciZadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/bib";
		String username = "root";
		String password = "";

		System.out.println("Povezivanje...");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesno ste se povezali sa bazom.");

			String update = "UPDATE biblioteke SET ulica =?, broj=? WHERE ime = ?";

			PreparedStatement ps = conn.prepareStatement(update);
			ps.setString(1, "Kneza Viseslava");
			ps.setString(2, "33");
			ps.setString(3, "Biblioteka Grada");

			int unos = ps.executeUpdate();

			if (unos > 0) {
				System.out.println("Uspesno ste uneli promene.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
