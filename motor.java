package br.com.fiapbens;

public class Motor {

	private String fabricante;
	private String potencia;
	private String TipoCombustivel;
	
	
	public Motor() {
		super();
	}
	
	public Motor(String fabricante, String potencia, String tipoCombustivel) {
		super();
		this.fabricante = fabricante;
		this.potencia = potencia;
		TipoCombustivel = tipoCombustivel;
	}

	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getTipoCombustivel() {
		return TipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}
	
}
