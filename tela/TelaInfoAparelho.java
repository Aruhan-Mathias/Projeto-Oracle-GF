package tela;

import entidade.Aparelho;
import util.Util;

public class TelaInfoAparelho {
	
	public static void infomacoesDoAparelho() {
		
		
		Aparelho aparelho = new Aparelho();
		
		System.out.println("Agora Insira as informações do aparelho: ");
		
		System.out.print("Marca: ");
		aparelho.marca =  Util.sc.nextLine();
		
		System.out.print("Modelo: ");
		aparelho.modelo = Util.sc.nextLine();
		
		System.out.print("Estado Atual: ");
		aparelho.estadoAtual = Util.sc.nextLine();
			
		  		  
		System.out.println("================= Aparelho Cadastrado ====================");
	}
	
}
