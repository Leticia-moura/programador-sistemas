package controller;

public class ExemploClassemath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double valSorteado = Math.random();
int resultado = 50 + (int) (valSorteado * 30);
System.out.println("sorteio entre 50 e 80: "+ resultado);
System.out.println("=============================================");
System.out.println("sorteio mega-sena ");
System.out.println(" ");
for (int i=0; i<6;i++) {
	double numeroSena = Math.random();
	int numeroSorteado = (int) (numeroSena * 61 );
	System.out.println("numero sorteado: "+numeroSorteado);
}
	}

}
