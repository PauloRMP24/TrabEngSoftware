package model;

public class Matricula {
	private int idMatricula, numero;
	private String data;
	private Aluno aluno;
	private Turma turma;
	
	public Matricula(int idMatricula, int numero, String data, Aluno aluno, Turma turma) {
		super();
		this.idMatricula = idMatricula;
		this.numero = numero;
		this.data = data;
		this.aluno = aluno;
		this.turma = turma;
	}
	
	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void registrarAlunoTurma(Aluno aluno, Turma turma) {
		
	}

	public void selecionarTurma(Turma turma) {
		
	}

	public void confirmarMatricula () {
	
	}
}
