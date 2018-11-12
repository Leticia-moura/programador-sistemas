package controller;

import util.teclado;

public class ComTratamentoDeErrosTentativas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0 ;
		int maxTries = 3;
		while (true) {
		try {
		double a = teclado.lerDouble("digite o numerador: ");
		double b = teclado.lerDouble("digite o denominador: ");
		double c = a/b;
		System.out.println("resultado da divisão de a por b é " + c );
		System.exit(0) ;
		}catch (NumberFormatException nfe) {
		System.out.println("caracter invalido!" );
		if (++count == maxTries) {
		System.out.println("numero de tentativas excedido " );
		System.exit(1);
		}
		else
		{
	continue;
	    }
                                  }
		}
	}
}


