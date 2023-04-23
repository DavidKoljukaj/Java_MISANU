package TreciZadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/bib";
		String username = "root";
		String password = "";

		System.out.println("Povezivanje...");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesno ste se povezali sa bazom.");

			String select = "SELECT * FROM biblioteke";

			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery(select);

			while (result.next()) {
				String ime = result.getString(2);
				String ulica = result.getString(3);
				String broj = result.getString(4);

				StringBuilder builder = new StringBuilder();
				builder.append("Naziv:");
				builder.append(ime);
				builder.append("\nUlica:");
				builder.append(ulica);
				builder.append("\nBroj:");
				builder.append(broj);

				System.out.println(builder.toString());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
