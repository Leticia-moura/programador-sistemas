package controller;
import model.*;


public class teste {

	public static void main(String[] args) {
		//usuario usu = new usuario ();
		aluno aluno = new aluno ("muzi","muzi123",1,"sergio muzi","tarde","primeiro",54321);
		aluno.mostrar();
		System.out.println("----------------------------------------------------");
		professor prof = new professor("joaquim","joaquim123",0,"joaquim da silva","doutor",1123) ;
		prof.mostrar();
		

	}

}
