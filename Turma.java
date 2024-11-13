package model;

public class Turma {
	private String turno, dia, horaInicio, horaFinalizar;
	private int codigo;
	private Professor professor;
	private Disciplina disciplina;

	public Turma(String turno, String dia, String horaInicio, String horaFinalizar, int codigo, Professor professor,
			Disciplina disciplina) {
		super();
		this.turno = turno;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFinalizar = horaFinalizar;
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFinalizar() {
		return horaFinalizar;
	}

	public void setHoraFinalizar(String horaFinalizar) {
		this.horaFinalizar = horaFinalizar;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void cadastrarTurma() {
		
	}

	public void selecionarTurma() {
		
	}

	public void selecionarDisciplina(Disciplina disciplina) {
		
	}

	public void selecionarProfessr (Professor Professor) {
		
	}
	
	public void adicionarAluno(Aluno aluno) {
		
	}
	
	public void removerAluno(Aluno aluno) {
		
	}
}
