package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {

	public static void main(String[] args) {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
	
		System.out.println("sem formatação "+valor);
		
		System.out.println("formatado "+f.format(valor));
		
		NumberFormat p = NumberFormat.getPercentInstance();
		double porcento = 0.05;
	
		System.out.println("sem formatação "+porcento);
		
		System.out.println("formatado "+p.format(porcento));
		
		NumberFormat n = NumberFormat.getNumberInstance();
		double numero =100.50;
	
		System.out.println("sem formatação "+numero);
		
		System.out.println("formatado "+n.format(numero));
		
		double valor2 = 12000.5;
		
		DecimalFormat g = new DecimalFormat(" R$ ###,###,###.00 ");
		
		System.out.println("sem formatação "+ valor2);
		
		System.out.println("formatado "+ g.format(valor2));
		
		
	}

}
