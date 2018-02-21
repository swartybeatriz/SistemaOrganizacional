package SisOrg.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import SisOrg.models.Caderno;




public class CadernosDAO {

	private Connection connection;

	public CadernosDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Caderno caderno) {

		String sql = "insert into cadernos (nome) " + "values ( ?);";

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
	
	public boolean remover(Caderno caderno) {
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
	public boolean alterar(Caderno caderno) {
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
	
public Caderno getById(long id) {
		
		Caderno result = null;
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cadernos where id =?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				result = new Caderno();
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

public Caderno getByNome(String nome) {

	Caderno result = null;
	try {
		PreparedStatement stmt = this.connection.prepareStatement("select * from cadernos where nome =?;");
		stmt.setString(1, nome);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			
			result = new Caderno();
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

public List<Caderno> getLista() {
	
	List<Caderno> result = new ArrayList<>();

	try {
		PreparedStatement stmt = this.connection.prepareStatement("select * from cadernos");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
		
			Caderno caderno = new Caderno();
			caderno.setId(rs.getInt("id"));
			caderno.setNome(rs.getString("nome"));
			

		

	
	result.add(caderno);
		}
		rs.close();
		stmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return result;
}
}
