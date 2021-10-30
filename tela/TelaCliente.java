package tela;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import entidade.Cliente;
import util.Util;

public class TelaCliente {

	static List<Cliente> clientes = new ArrayList<>();
	
	public static Cliente cadastrarCliente() {
		Cliente c = new Cliente();
		
		System.out.println("==============DADOS CLIENTE=================");
		System.out.println("Digite o Nome Completo do Cliente: ");
		c.nome = Util.sc.nextLine();
		System.out.println("Digite o número para contato do Cliente: ");
		c.telefone = Long.parseLong(Util.sc.nextLine());
		c.rg = opcaoDeCadastroRg();
		System.out.println("==============Cadastro com sucesso============== \n");
		clientes.add(c);
		
		
		TelaInfoAparelho.infomacoesDoAparelho();
		return c;
	}
	
	static int opcaoDeCadastroRg() {
		JFrame jFrame = new JFrame();
		int rg = 0;

		System.out.println("Deseja  inserir RG do cliente? \n"
				+ "1 - Sim \n"
				+ "2 - Não \n");
		int opcao = Integer.parseInt(Util.sc.nextLine());
		
		switch (opcao) {
	     case 1:
	    	 rg = cadastrarRgDoCliente();
	     case 2:
	       //TELA04
	       break;
	     default:
	    	 JOptionPane.showMessageDialog(jFrame, "Opção inválida... Insira uma opção válida");
	    	 opcaoDeCadastroRg();
	  }
		return rg;
	}
	
	static int cadastrarRgDoCliente() {
		System.out.println("Digite o RG do cliente");
		return Util.sc.nextInt();
	}
	
	static void mostrarTodosClientes(List<Cliente> clientes) {
		for(int i =0; i < clientes.size(); i++) {
			mostrarCliente(clientes.get(i), i);
		}
	}
	
	
	public static void mostrarTodosClientes() {
		for(int i = 0; i < clientes.size(); i++) {
			mostrarCliente(clientes.get(i), i);
		}
	}

	static void mostrarCliente(Cliente cliente) {
		System.out.println("==============DADOS CLIENTE=================");
		System.out.println("Nome: " + cliente.nome);
		System.out.println("rg: " + cliente.rg);
		System.out.println("============================================");
	}
	
	static void mostrarCliente(Cliente cliente, int posicao) {
		System.out.println("==============DADOS CLIENTE[" + posicao + "]=================");
		System.out.println("Nome: " + cliente.nome);
		System.out.println("rg: " + cliente.rg);
		System.out.println("============================================");
	}
	
	
	static List<Cliente> buscarClientes(String nome){
		List<Cliente> clientesEncontrados = new ArrayList<Cliente>();
		for(int i =0; i < clientes.size(); i++) {
			if(clientes.get(i).nome.toLowerCase().contains(nome.toLowerCase())) {
				clientesEncontrados.add(clientes.get(i));
			}
		}
		return clientesEncontrados;
	}
	
	
	
	public static void main(String[] args) {	
		
//		Cliente clienteCadastrado = cadastrarCliente();

//	    clienteCadastrado = cadastrarCliente();
	    
//	    System.out.println("Clientes encontrados");
//	    List<Cliente> buscarClientes = buscarClientes("wil");
//	    mostrarTodosClientes(buscarClientes);
		
		
		
		
	}
	
}
