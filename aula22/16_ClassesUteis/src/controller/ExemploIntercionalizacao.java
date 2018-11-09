package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploIntercionalizacao {
	public static void main (String[] args) {
		double valor = 55008.537;
	
		System.out.println("=============================================");
		
		Locale.setDefault(Locale.FRANCE);
		NumberFormat f = NumberFormat.getCurrencyInstance();
		System.out.println("sem formatação "+valor);	
		System.out.println("formatado "+f.format(valor));
		
		System.out.println("=============================================");
		
		Locale.setDefault(Locale.UK);
		NumberFormat g = NumberFormat.getCurrencyInstance();
		System.out.println("sem formatação "+valor);	
		System.out.println("formatado "+g.format(valor));
		
		System.out.println("=============================================");
		
		Locale local = new Locale("pt","BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		System.out.println("sem formatação "+valor);	
		System.out.println("formatado "+ nf.format(valor));
		
	}
	

}
