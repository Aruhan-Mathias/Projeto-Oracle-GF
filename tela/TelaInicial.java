package tela;

import entidade.Funcionario;
import util.Util;

public class TelaInicial {
	
	public static void main(String[] args) {
		funcionarioResponsavel();		
	}

	public static void funcionarioResponsavel() {
		Funcionario funcionario = new Funcionario();
		
		System.out.println("====SISTEMA DE EMISS�O DE NOTAS LOJA WL ASSISTENCIA T�CNICA========");
			
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.nome = Util.sc.nextLine();
		
		TelaMenu.escolherOpcao();
		
	}
	
	
}
