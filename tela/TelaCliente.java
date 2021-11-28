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
		Cliente cliente = new Cliente();
		String telefoneTipoString;
		
		System.out.println("==============DADOS CLIENTE=================");
		
		System.out.println("Digite o Nome Completo do Cliente: ");
		cliente.nome = Util.sc.nextLine();
		cliente.nome = checkNumber(cliente.nome, "Digite o Nome Completo do cliente: ");
		
		System.out.println("Digite o Número para contato do cliente: ");
		telefoneTipoString = Util.sc.nextLine();
		
		cliente.telefone = checkLetters(telefoneTipoString, "Digite o Número para contato do cliente: ");		
		
		cliente.rg = opcaoDeCadastroRg();
		System.out.println("==============Cadastro com sucesso============== \n");
		clientes.add(cliente);
		
		TelaInfoAparelho.infomacoesDoAparelho();
		return cliente;
	}
	
	public static String checkNumber(String clienteNome, String msg) {
				
		if(clienteNome.matches("^\\d+$")) {
			
			while(clienteNome.matches("^\\d+$")) {
				System.out.println("Preencha o campo apenas com LETRAS, tente novamente \n");
				System.out.println(msg);
				clienteNome = Util.sc.nextLine();
			}
							
		}
		
		return clienteNome;
		
	}
	
	public static int checkLetters(String telefone, String msg) {
		
		
		if(telefone.matches("[a-zA-Z]+")) {
			
			while(telefone.matches("[a-zA-Z]+")) {
				System.out.println("Preencha o campo apenas com LETRAS, tente novamente \n");
				System.out.println(msg);
				telefone = Util.sc.nextLine();
				System.out.println(telefone);
			}
			
		}
		
		if(telefone.length() < 9) {
			
			while(telefone.length() < 9) {
				System.out.println("Preencha o campo com ao menos 9 caracteres, tente novamente \n");
				System.out.println(msg);
				telefone = Util.sc.nextLine();
			}
			
		}
		
	    
		return Integer.parseInt(telefone);
	    
	}

	public static boolean checkString(String str) {
		
	    return str.matches("[a-zA-Z]+");
	    
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
