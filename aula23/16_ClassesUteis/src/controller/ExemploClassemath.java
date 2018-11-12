package controller;

public class ExemploClassemath {

	public static void main(String[] args) {
		
		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("sorteio entre 50 e 80: " + resultado);
		System.out.println(" ");

		System.out.println("=============================================");

		System.out.println("sorteio mega-sena ");
		System.out.println(" ");
		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("numero sorteado: " + numeroSorteado);
			System.out.println(" ");
		}
		System.out.println("=============================================");
		System.out.println("maior entre dois numeros ");
		System.out.println(" ");
		int maior;
		maior = Math.max(resultado, 65);
		System.out.println("entre 65 e " + resultado + " o maior valor é " + maior);
		System.out.println(" ");

		System.out.println("=============================================");
		System.out.println("área de um círculo de raio 5 ");
		System.out.println(" ");
		double area = Math.PI * Math.pow(5, 2);
		System.out.println("área de um círculo de raio 5 é " + area);
		System.out.println(" ");
		System.out.println("=============================================");

		System.out.println(" ");
		double sen, cos, tan;
		double a = 60;
		sen = Math.sin(Math.toRadians(a));
		cos = Math.cos(Math.toRadians(a));
		tan = Math.tan(Math.toRadians(a));
		System.out.println("seno " + sen);
		System.out.println("cosseno " + cos);
		System.out.println("tangente " + tan);

		System.out.println(" ");
		System.out.println("=============================================");

		System.out.println(" ");
		

		double raiz = Math.sqrt(4);
		System.out.println("raiz quadrada de 4 é " + raiz);
		System.out.println(" ");
		System.out.println("=============================================");
		System.out.println(" ");

	}

}
