package SisOrg.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import SisOrg.models.Cadernos;




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
	public boolean alterar(Cadernos caderno) {
		String sql = "update cadernos set nome=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, caderno.getNome());
			stmt.setLong(2, caderno.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
public Cadernos getById(long id) {
		
		Cadernos result = null;
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cadernos where id =?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				result = new Cadernos();
				result.setId(rs.getLong("id"));
				result.setNome(rs.getString("nome"));

				}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return result;
		
	}
}
