package tela;

import entidade.Funcionario;
import util.Util;

public class TelaInicial {
	
	public static void main(String[] args) {
		funcionarioResponsavel();		
	}

	public static void funcionarioResponsavel() {
		Funcionario funcionario = new Funcionario();
		
		System.out.println("====SISTEMA DE EMISSÃO DE NOTAS LOJA WL ASSISTENCIA TÉCNICA========");
			
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nome = Util.sc.nextLine();
		
		TelaMenu.escolherOpcao();
		
	}
	
	
}
