package controller;

public class somaController {

	public somaController() {
		
		super();
		
	}
	
	public double soma(int valor) {

		//O primeiro valor da somatória sempre será 1, então quando o valor for
		//subtraído o suficiente ele deverá retornar 1
		if (valor == 1) {
			
			return 1;
			
		} else {
			
			int fat = 1;
			for (int i = valor; i > 0 ; i--) {
				
				fat = fat * i;
				
			}
			
			return (1 / (double)fat) + (soma(valor - 1));
			//Seguindo o padrão da somatória, dividimos o 1 pela fatorial do valor
			//e somamos com o valor subtraído por 1
			
		}
		
	}
	
}