package controller;

import util.teclado;

public class ComTrtamentoDeErros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		double a = teclado.lerDouble("digite o numerador: ");
		double b = teclado.lerDouble("digite o denominador: ");
		double c = a/b;
		System.out.println("resultado da divis�o de a por b � " + c );
	       }
		catch (NumberFormatException nfe) 
		{
		System.out.println("caracter invalido!" );
	
	    }
         catch(ArithmeticException ae)
	    {
		System.out.println("divis�o por zero ");
	    }
                                          }
	                              }