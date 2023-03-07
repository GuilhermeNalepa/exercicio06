package view;

import controller.somaController;

public class Principal {
	
	public static void main(String[] args) {
		
		somaController sc = new somaController();
		
		int n = 5;
		double soma = sc.soma(n);
		
		System.out.println("Somatório = " + soma);
		
	}
	
}