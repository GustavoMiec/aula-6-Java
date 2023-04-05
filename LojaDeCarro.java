package br.com.fiapbens;

public class LojaDeCarro {

	private String nome;
	private String cnpj;
	private Endereco endereco;
	private Funcionario funcionario;
	private Carro carro;
	public LojaDeCarro() {
		super();
	}
	public LojaDeCarro(String nome, String cnpj, Endereco endereco, Funcionario funcionario, Carro carro) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.funcionario = funcionario;
		this.carro = carro;
	}
	public LojaDeCarro(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
	
}
