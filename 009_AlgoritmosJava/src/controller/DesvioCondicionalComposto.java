package controller;

import util.teclado;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {

		int a,b,x;
		
		a = teclado.lerInt("Informe o primeiro numero: ");
		b = teclado.lerInt("Informe o segundo numero: ");

		x = a + b;
		
		if(x >= 10){
			System.out.println("O valor da soma é "+x+ " acrescido de 5 : "+ (x+5) );
		}
		else {
			
			System.out.println("O valor da soma é " +x+ " subtraído de 7  "+ (x-7));
		}

	}

}
