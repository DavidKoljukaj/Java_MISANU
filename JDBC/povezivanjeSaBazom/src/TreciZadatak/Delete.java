package TreciZadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/bib";
		String username = "root";
		String password = "";

		System.out.println("Povezivanje...");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesno ste se povezali sa bazom.");
			String delete = "DELETE FROM biblioteke WHERE ime = ?";

			PreparedStatement ps = conn.prepareStatement(delete);
			ps.setString(1, "Biblioteka Grada");

			int brisanje = ps.executeUpdate();

			if (brisanje > 0) {
				System.out.println("Uspesno ste obrisali podatke.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
