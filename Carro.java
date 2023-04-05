package br.com.fiapbens;

public class Carro {

	private String modelo;
	private String marca;
	private int ano;
	private double valor;
	private String marcha;
	private Motor motor;
	
	
	public Carro() {
		super();
	}
	
	
	public Carro(String modelo, String marca, int ano, double valor, String marcha, Motor motor) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valor = valor;
		this.marcha = marcha;
		this.motor = motor;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMarcha() {
		return marcha;
	}
	public void setMarcha(String marcha) {
		this.marcha = marcha;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
}
