package SisOrg.models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Cadernos {
	private long id ;
	private String nome;
	@DateTimeFormat(pattern= "dd/MM/yyyy")
	private Calendar dataCriacaoCadernos;

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
	public Calendar getDataCriacaoCadernos() {
		return dataCriacaoCadernos;
	}
	public void setDataCriacaoCadernos(Calendar dataCriacaoCadernos) {
		this.dataCriacaoCadernos = dataCriacaoCadernos;
	}
	
}
