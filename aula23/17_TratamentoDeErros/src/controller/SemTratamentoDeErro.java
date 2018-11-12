package controller;

import util.teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = teclado.lerDouble("digite o numerador: ");
		double b = teclado.lerDouble("digite o denominador: ");
		double c = a/b;
		System.out.println("resultado da divisão de a por b é " + c );
		

	}

}
