package controller;

	import model.pessoa;
	
public class Cadastro {
	

	 public static void main(String[] args) {
		 
	 pessoa pessoa = new pessoa();
	 
	 pessoa.setNome("Leticia Moura");
	 pessoa.setIdade(20);
	 pessoa.setSexo("Feminino");
	 
	 System.out.println("Nome: " + pessoa.getNome());
	 System.out.println("Idade: " + pessoa.getIdade());
	 System.out.println("Sexo: " + pessoa.getSexo());

	 }

}



