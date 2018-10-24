package controller;

import util.teclado;

public class operadores {

	public static void main(String[] args) {
		String nome;
		double nota1 , nota2 , nota3 ,nota4 , media ;
		
		nome = teclado.lerTexto("Digite seu nome: ");
		nota1 = teclado.lerDouble("Digite sua nota 1: ");
		nota2 = teclado.lerDouble("Digite sua nota 2: ");
		nota3 = teclado.lerDouble("Digite sua nota 3: ");
		nota4 = teclado.lerDouble("Digite sua nota 4: ");
		
		media = (nota1+nota2+nota3+nota4)/4;
		
System.out.println("ola "+ nome +" sua media de notas é: " + media);

	}

}
