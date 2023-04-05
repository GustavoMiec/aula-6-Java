package br.com.fiapbens;

public class Endereco {

	private String logradouro;
	private String cep;
	private int numero;
	private String bairro;
	private String municipio;
	private String Estado;
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, String cep, int numero, String bairro, String municipio, String estado) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		Estado = estado;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}

	
	
}
