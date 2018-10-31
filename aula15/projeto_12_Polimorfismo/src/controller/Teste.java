package controller;
import model.ContaCorrente;
import model.ContaEspecial;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ContaCorrente cc = new ContaCorrente ("Michael oliveira","0001","123456",250);
	System.out.println("saldo Michael ");
	System.out.println(cc.calcularSaldo());
	
	ContaEspecial cce = new ContaEspecial ("fabricio oliveira","0034","678910",0.50,500);
	System.out.println("saldo fabricio ");
	System.out.println(cce.calcularSaldo());
	
	}

}
