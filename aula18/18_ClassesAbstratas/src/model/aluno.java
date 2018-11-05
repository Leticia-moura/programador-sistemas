package model;

public class aluno extends usuario {
	private int matriculaAluno;
	private String nome;
	private String turno;
	private String turma;
	private static int numStudents = 1;

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	public aluno() {
		super();
	}
	
	public aluno(String login, String senha, int tipo ,int matriculaAluno, String nome, String turno, String turma) {
		super(login, senha, tipo);
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
		numStudents ++;
		
	}

	@Override
	public void mostrar() {
		System.out.println("Informação do aluno: ");
		System.out.println("Login: "+ super.getLogin());
		System.out.println("senha:***** ");
		
		System.out.println("Matricula: "+ matriculaAluno);
		System.out.println("Nome: " +nome);
		System.out.println("Turno: "+turno);
		System.out.println("Turma: "+turma);
		
	}
	public static int getNumAlunos() {
		return numStudents;
	}

}
