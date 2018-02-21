package SisOrg.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SisOrg.models.Nota;
import SisOrg.models.Usuario;


public class NotaDAO {
	private Connection connection;

	public NotaDAO() {
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean inserir(Nota nota) {

		String sql = "insert into notas (nome, texto, id_caderno) " + "values ( ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			stmt.setString(1, nota.getNome());
			stmt.setString(2, nota.getConteudo());
			stmt.setLong(3, nota.getCaderno().getId());


		
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	
	}
	
	public boolean alterar(Nota notas) {
		String sql = "update contatos set nome=?, texto=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, notas.getNome());
			stmt.setString(2, notas.getConteudo());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean remover(Usuario notas) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from usuarios where id=?;");
			stmt.setLong(1, notas.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public Usuario getById(long id) {
		
		Usuario result = null;
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where id =?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				result = new Usuario();
				result.setId(rs.getLong("id"));
				result.setNome(rs.getString("nome"));
				result.setEmail(rs.getString("email"));
				result.setSenha(rs.getString("senha"));

				}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return result;
		
	}
	public List<Nota> getLista() {
		List<Nota> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from notas");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Nota notas = new Nota();
				notas.setId(rs.getLong("id"));
				notas.setNome(rs.getString("nome"));
				notas.setConteudo(rs.getString("texto")); // texto no banco, conteudo no model
				
				

				
				result.add(notas);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
}
