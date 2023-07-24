package com.fiap.view; 

public class Caixa {

	public static void main (String[] args) {
		
		int qtdProdutos = 5;
		int registro = 0;
		
		
		// executando o WHILE 
		
//		while (registro < qtdProdutos) {
//			registro++;
//			System.out.println("O produto número " + registro + " foi registrado");
//			
//		}
		
	
		// executando o DO WHILE
		
//		do {
//			registro++;
//			System.out.println(" O caixa registrou o produto " + registro);
//						
//		} while (registro < qtdProdutos);
		
		
		for (int i = 1; i <= qtdProdutos; i++) { // dessa forma, vai comeraça a contar do zero, ficando 0,1,2,3,4 até o 4 pois tem 5 reptição
			// para iniciar do numero 1 e terminar no 5, tem que alterar para iniciar no 1 e finalizar com menor ou igual a 5 <=
			
			System.out.println("O caixa registrou o produto " + i);
			
			
		}
		
	}
	
}
