package SisOrg.models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Notas {
	
	private String nome; 
	private String conteudo;
	@DateTimeFormat(pattern= "dd/MM/yyyy")
	private Calendar dataCriacaoNotas;

	private long id ;
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
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Calendar getDataCriacaoNotas() {
		return dataCriacaoNotas;
	}
	public void setDataCriacaoNotas(Calendar dataCriacaoNotas) {
		this.dataCriacaoNotas = dataCriacaoNotas;
	}

}
