package tela;

import entidade.Aparelho;
import util.Util;

public class TelaInfoAparelho {
	
	public static void infomacoesDoAparelho() {
		
		
		Aparelho aparelho = new Aparelho();
		
		System.out.println("Agora Insira as informações do aparelho ");

		System.out.println("Marca: ");
		aparelho.marca =  Util.sc.nextLine();
		
		System.out.println("Modelo: ");
		aparelho.modelo = Util.sc.nextLine();
		
		System.out.println("Estado Atual: ");
		aparelho.estadoAtual = Util.sc.nextLine();
			
		  		  
		System.out.println("================= Aparelho Cadastrado ====================");
	}
	
}
