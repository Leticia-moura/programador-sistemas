package controller;

public class ExemploTypeCast {

	public static void main (String [] args) {
		
		int a = 5, b = 2;
		int c;
		
		c= a/b;
		System.out.println("Valor de C:" + c);
	
		double d;
		d= a/b;
		System.out.println("Valor de D:" + d);
		
		double e;
		//CONVERSÃO EXPLICITA
		e=(double)a/b;
		System.out.println("Valor de E:" + e);
	
		float f = 14.5f;
		//CONVERSÃO IMPLICITA
		e=f;
		System.out.println("Valor de E:" + e);
	}
	
}
