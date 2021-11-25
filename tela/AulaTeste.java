package tela;

public class AulaTeste {
	
	public static void main(String[] args) {
		
		double idades[] = getIdades();
		
		double result = somaIdades(idades);
		
		System.out.print(result);
		
	}
	
	
	static double[] getIdades() {
		
		double[] idades = {10.1, 10.4} ;
		
		return idades;
		
	}
	
	static double somaIdades(double[] idades) {
		
		double somaDasIdades = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			somaDasIdades = somaDasIdades + idades[i];
			
		}
		
		return somaDasIdades;
				
	}
	
	
}


