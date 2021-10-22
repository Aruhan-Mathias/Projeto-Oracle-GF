package tela;

import java.util.Scanner;

import entidade.Funcionario;
import tela.TelaMenu;

public class TelaFuncionario {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		funcionarioResponsavel();		
	}

	public static void funcionarioResponsavel() {
		Funcionario funcionario = new Funcionario();
		
		System.out.println("====SISTEMA DE EMISSÃO DE NOTAS LOJA WL ASSISTENCIA TÉCNICA========");
			
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		
		TelaMenu telaMenu = new TelaMenu();
		telaMenu.escolherOpcao();
		
	}
	
	
}
