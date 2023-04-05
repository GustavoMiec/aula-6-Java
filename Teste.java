package br.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiapbens.Carro;
import br.com.fiapbens.Endereco;
import br.com.fiapbens.Funcionario;
import br.com.fiapbens.LojaDeCarro;
import br.com.fiapbens.Motor;

public class Teste {

	public static void main(String[] args) {
		LojaDeCarro objLojaDeCarro = new LojaDeCarro(JOptionPane.showInputDialog("Digite o nome da loja"),
				JOptionPane.showInputDialog("Digite o CNPJ"));
		Carro objCarro = new Carro();
		Endereco objEndereco = new Endereco();
		Funcionario objFuncionario = new Funcionario();
		Motor objMotor = new Motor();
		
		objLojaDeCarro.setEndereco(objEndereco);
		objLojaDeCarro.setFuncionario(objFuncionario);
		objLojaDeCarro.setCarro(objCarro);
		
		objCarro.setMotor(objMotor);
		

	}

}
