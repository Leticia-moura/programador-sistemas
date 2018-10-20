package controller;

public class ChamadaMetodo {
	public static void main(String [] args) {
	System.out.println("Iniciando o programa");
	primeiro ();
	System.out.println("Continuando o programa" );
	terceiro ();
	System.out.println("Terminando o programa");
	}
	public static void primeiro () {
	System.out.println("Iniciando o Metodo 1");
	System.out.println("Terminando o Metodo 1");
	segundo();
	}
	public static void segundo() {
	System.out.println("Iniciando o Metodo 2");
	System.out.println("Terminando o Metodo 2" );
	}
	public static void terceiro () {
	System.out.println("Iniciando o Metodo 3" );
	System.out.println("Terminando o Metodo 3" );
	}
}
