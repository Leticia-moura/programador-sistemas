package controller;

import util.teclado;

public class ExemploEntrada {
	public static void main(String[] args) {

		String nome;
		int idade;
		double salario;
		
		nome = teclado.lerTexto("Digite seu nome: ");
		
		idade = teclado.lerInt("digite sua idade: ");
			
		salario = teclado.lerDouble("digite seu salario: ");

		System.out.println("Nome informado: " + nome);
		System.out.println("Idade informada: " + idade);
		System.out.println("Salario informado: " + salario);
	}
}
