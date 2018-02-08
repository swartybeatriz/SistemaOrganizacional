package SisOrg.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import SisOrg.models.Cadernos;
import SisOrg.models.Usuario;


public class CadernosDAO {

	private Connection connection;

	public CadernosDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Cadernos caderno) {

		String sql = "insert into usuarios (nome) " + "values ( ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, caderno.getNome());
			
// tem que setar o id das notas ?
		
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public boolean remover(Cadernos caderno) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from cadernos where id=?;");
			stmt.setLong(1, caderno.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
