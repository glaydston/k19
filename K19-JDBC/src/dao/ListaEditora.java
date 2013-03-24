package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class ListaEditora {

	public static void main(String[] args) {

		try {
			System.out.println(">> -- Abrindo Conexão...");
			Connection connection = ConnectionFactory.openConnection();

			String sql = "SELECT * FROM Editora";

			PreparedStatement stmt = connection.prepareStatement(sql);

			System.out.println(">> -- Executando comando...");
			ResultSet rs = stmt.executeQuery();

			System.out.println(">> -- Resulados Encontrados: 	\n");
			while (rs.next()) {
				System.out.printf("%d : %s - %s\n", rs.getInt("id"),
						rs.getString("nome"), rs.getString("email"));
			}

			System.out.println(">> -- Fechando Conexão...");
			connection.close();
		} catch (SQLException e) {
			System.err.println(">> -- SQLException: " + e.getMessage());
		}

	}

}
