package SisOrg.models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Nota {

	private String nome;
	private String conteudo;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Calendar dataCriacaoNotas;
	private Caderno caderno;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public void setEmail(String string) {
		this.setEmail(string);

	}

	public void setSenha(String string) {
		this.setSenha(string);

	}
	
	public Caderno getCaderno() {
		return caderno;
	}

	public void setCaderno(Caderno caderno) {
		this.caderno = caderno;
	}


}