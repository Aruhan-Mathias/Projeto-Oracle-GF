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
		
		if(checkLetters(funcionario.nome)) {
			
			int validaNomeDoFuncionario = removeEspacoEmBranco(funcionario.nome);
			
			while(validaNomeDoFuncionario <= 2) {
				System.out.println("Digite um nome com mais de 2 caracteres.");
				funcionario.nome = Util.sc.nextLine();
			}
			
			TelaMenu.escolherOpcao();
			
		} else {
			
			while(!checkLetters(funcionario.nome)) {
				System.out.println("Neste campo não é permitido números. Tente Novamente:");
				funcionario.nome = Util.sc.nextLine();
			}
			
			TelaMenu.escolherOpcao();
			
		}
		
						
		
	}
	
	private static int removeEspacoEmBranco(String nome) {
		
		return nome.replaceAll(" ", "").length();
		
	}
	
	public static boolean checkLetters(String str) {
		
	    return str.matches("[a-zA-Z]+");
	    
	}
	
}
