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
		  System.out.println("Escolha a op��o: ");
		  System.out.println("0 - Encerrar Programa. \n"
		  		+ "1 - Criar Ordem de Servi�o (novo cliente). \n"
				  + "2 - Criar Ordem de Servi�o (cliente j� cadastrado).");
		  		  
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
		       System.out.println("Op��o ainda n�o desenvolvida.");
		       break;
		     default:
		    	 JOptionPane.showMessageDialog(jFrame, "Op��o inv�lida... Insira uma op��o v�lida");
		    	 escolherOpcao();
		  }
		
	}

}
