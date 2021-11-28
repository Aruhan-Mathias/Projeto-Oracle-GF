package tela;

import javax.swing.JOptionPane;

import util.Util;

public class TelaMenu {
	
	public static void main(String[] args) {
		
		escolherOpcao();
		
	}
	
	public static void escolherOpcao() {
		  
		System.out.println("=====================================");
		System.out.println("Escolha a opção: ");
		System.out.println("0 - Encerrar Programa. \n"
				+ "1 - Criar Ordem de Serviço (novo cliente). \n"
				+ "2 - Criar Ordem de Serviço (cliente já cadastrado).");
		  		  
		System.out.println("=====================================");
		String opcaoSelecionada = Util.sc.nextLine();
		  
		if(opcaoSelecionada.matches("^\\d+$")) {
			
			int opcao;
		  		
			opcao = Integer.parseInt(opcaoSelecionada);
		  				
			switch (opcao) {
			
				case 0:
					 JOptionPane.showMessageDialog(null, "Programa encerrado :)");
					 return;
			case 1:
					TelaCliente.cadastrarCliente();
				break;
				
				case 2:
					System.out.println("Opção ainda não desenvolvida.");
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida... Insira uma opção válida");
					escolherOpcao();
				break;
			}
			  
		  }else {
			  
			  while(!opcaoSelecionada.matches("^\\d+$")) {
				  System.out.println("//Neste campo é permitido apenas NÚMEROS. Tente Novamente \n");
				  escolherOpcao();
			  }
			  
		  }	
		
	 }
	
}
