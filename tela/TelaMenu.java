package tela;

import javax.swing.JOptionPane;

import util.Util;

public class TelaMenu {
	
	public static void main(String[] args) {
		
		escolherOpcao();
		
	}
	
	public static void escolherOpcao() {
		  
		System.out.println("=====================================");
		System.out.println("Escolha a op��o: ");
		System.out.println("0 - Encerrar Programa. \n"
				+ "1 - Criar Ordem de Servi�o (novo cliente). \n"
				+ "2 - Criar Ordem de Servi�o (cliente j� cadastrado).");
		  		  
		System.out.println("=====================================");
		String opcaoSelecionada = Util.sc.nextLine();
		  
		if(opcaoSelecionada.matches("^\\d+$")) {
			
			int opcao;
		  		
			opcao = Integer.parseInt(opcaoSelecionada);
		  				
			switch (opcao) {
			
				case 0:
					 JOptionPane.showMessageDialog(null, "Programa encerrado :)");
				break;
				
				case 1:
					TelaCliente.cadastrarCliente();
				break;
				
				case 2:
					System.out.println("Op��o ainda n�o desenvolvida.");
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Op��o inv�lida... Insira uma op��o v�lida");
					escolherOpcao();
			}
			  
		  }else {
			  
			  while(!opcaoSelecionada.matches("^\\d+$")) {
				  
				  System.out.println("//Neste campo � permitido APENAS Letras. Tente Novamente \n");
				  escolherOpcao();
				  
			  }
			  
		  }		  

	}
	
}
