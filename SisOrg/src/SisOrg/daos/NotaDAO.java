package SisOrg.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SisOrg.models.Caderno;
import SisOrg.models.Nota;



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
		String sql = "update notas set nome=?, texto=? where id=?";
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

	public boolean remover(Nota notas) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from notas where id=?;");
			stmt.setLong(1, notas.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public Nota getById(long id) {
		
		Nota result = null;
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from notas where id =?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				result = new Nota();
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
	public List <Nota> getLista(Caderno c ) { //Listagem das notas pelo id do caderno
		List <Nota> result = new ArrayList<>();
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from notas where id_caderno =? ");
			
			stmt.setLong(1, c.getId()); 
			
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Nota nota = new Nota ();
				nota.setId(rs.getLong("id"));
				nota.setNome(rs.getString("nome"));
				nota.setConteudo(rs.getString("conteudo"));
				
				nota.setCaderno(new Caderno());
				nota.getCaderno().setId(rs.getLong("id"));
				
				
				result.add(nota);
			}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
}
	
	public List<Nota> getListaa() {   //listagem das notas geral
		List<Nota> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from notas");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
		
				Nota notas = new Nota();
				notas.setId(rs.getLong("id"));
				notas.setNome(rs.getString("nome"));
				notas.setConteudo(rs.getString("texto")); 
				
				

				
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
