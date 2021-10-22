package tela;

import java.util.Scanner;
import javax.swing.*;

public class TelaMenu {
	
	public static void main(String[] args) {
		escolherOpcao();
	}
	
	public static void escolherOpcao() {
		  JFrame jFrame = new JFrame();
		  
		  TelaCliente telaCliente = new TelaCliente();
		  
		  Scanner opcaoEscolhida = new Scanner(System.in);
		  System.out.println("=====================================");
		  System.out.println("Escolha a opção: ");
		  System.out.println("0 - Encerrar Programa. \n"
		  		+ "1 - Criar Ordem de Serviço (novo cliente). \n"
				  + "2 - Criar Ordem de Serviço (cliente já cadastrado).");
		  		  
		  System.out.println("=====================================");
		  int opcao = opcaoEscolhida.nextInt();
		  switch (opcao) {
		  	 case 0:
		  		JOptionPane.showMessageDialog(jFrame, "Programa encerrado :)");
		  		//Arrumar o break do console
		       break;
		     case 1:
		    	 telaCliente.cadastrarCliente();
		       break;
		     case 2:
		       System.out.println("Opção ainda não desenvolvida.");
		       break;
		     default:
		    	 JOptionPane.showMessageDialog(jFrame, "Opção inválida... Insira uma opção válida");
		    	 escolherOpcao();
		  }
		
	}

}
