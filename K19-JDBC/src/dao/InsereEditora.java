package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import factory.ConnectionFactory;

public class InsereEditora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println(">> -- Abrindo Conexão...");
			Connection connection = ConnectionFactory.openConnection();

			System.out.println(">> -- Digite o nome da Editora: ");
			String nome = entrada.nextLine();

			System.out.println(">> -- Digite o email da Editora: ");
			String email = entrada.nextLine();

			String sql = "INSERT INTO Editora (nome, email) VALUES (?, ?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, nome);
			stmt.setString(2, email);

			System.out.println(">> -- Executando comando...");
			stmt.execute();

			System.out.println(">> -- Fechando Conexão...");
			connection.close();
		} catch (SQLException e) {
			System.err.println(">> -- SQLException: " + e.getMessage());
		}
	}

}
