package controller;

import java.util.Scanner;

public class ExemploScanner2 {
	
	public static void main(String[] args) {
		
		   String nome;
			double salario;
		
		System.out.println("qual seu nome: ");
		Scanner sc= new Scanner (System.in);
		nome = sc.nextLine();
		System.out.println("o nome digitado é: " + nome);
		
		System.out.println("qual seu salario: ");
		Scanner sc2 = new Scanner (System.in);
		salario = sc2.nextDouble();
		System.out.println("salario digitado: " + salario);
		
		sc.close();
		sc2.close();
		
		
	}
}
