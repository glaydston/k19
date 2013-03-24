package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	public static Connection openConnection() {
		Properties config = new Properties();

		config.setProperty("database.url","jdbc:mysql://localhost:3306/livraria");
		config.setProperty("database.login", "root");
		config.setProperty("database.password", "admin");

		String url = config.getProperty("database.url");
		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			System.err.println(">> -- SQLException: " + e.getMessage());
		}

		return connection;
	}
}
