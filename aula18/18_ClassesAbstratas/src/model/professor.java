package model;

public class professor extends usuario {
	private int matriculaProfessor;
	private String nome;
	private String especialidade;
	private static int numProfessores = 0;

	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public professor() {
		super();
	}


	
	public professor(String login, String senha, int tipo, int matriculaProfessor, String nome, String especialidade) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
		numProfessores ++;
	}
	@Override
	public void mostrar() {
		System.out.println("Informação do Professor: ");
		System.out.println("Login: "+ super.getLogin());
		System.out.println("senha:***** ");
		
		System.out.println("Matricula: "+ matriculaProfessor);
		System.out.println("Nome: " +nome);
		System.out.println("Especialidade: "+especialidade);
		
		
	}
	public static int getNumProfessores() {
		return numProfessores;
	}
}
