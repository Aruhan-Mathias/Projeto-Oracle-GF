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
		
		System.out.println("====SISTEMA DE EMISS�O DE NOTAS LOJA WL ASSISTENCIA T�CNICA========");
			
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();
		
		TelaMenu telaMenu = new TelaMenu();
		telaMenu.escolherOpcao();
		
	}
	
	
}
