package SisOrg.daos;

import java.sql.Connection;

public class NotasDAO {
	private Connection connection;

	public NotasDAO() {
		connection = ConnectionFactory.getConnection();
	}
	
	
}
