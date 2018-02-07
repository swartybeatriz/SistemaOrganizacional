package SisOrg.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import SisOrg.models.Notas;


public class NotasDAO {
	private Connection connection;

	public NotasDAO() {
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean inserir(Notas notas) {

		String sql = "insert into usuarios (nome,texto, dataCriacao) " + "values ( ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, notas.getNome());
			stmt.setString(2, notas.getConteudo());
			stmt.setDate(4, new java.sql.Date(notas.getDataCriacaoNotas().getTimeInMillis()));

		
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	
	}
	
}
