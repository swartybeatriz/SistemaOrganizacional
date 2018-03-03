package SisOrg.models;


import java.util.List;



public class Caderno {
	private long id ;
	private String nome;
	private List<Nota> notas;
	private String descricao; 
	

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
