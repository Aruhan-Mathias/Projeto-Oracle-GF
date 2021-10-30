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
		  int opcao = Integer.parseInt(Util.sc.nextLine());
		  switch (opcao) {
		  	 case 0:
		  		JOptionPane.showMessageDialog(null, "Programa encerrado :)");
		  		
		       break;
		     case 1:
		    	 TelaCliente.cadastrarCliente();
		       break;
		     case 2:
		       System.out.println("Opção ainda não desenvolvida.");
		       break;
		     default:
		    	 JOptionPane.showMessageDialog(null, "Opção inválida... Insira uma opção válida");
		    	 escolherOpcao();
		  }
		
	}

}
