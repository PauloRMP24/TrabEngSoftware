package model;

public class Realiza {
	private int idRealiza;
	private float nota;
	public Matricula matricula;
	private Prova prova;
	
	public Realiza(int idRealiza, float nota, Matricula matricula, Prova prova) {
		this.idRealiza = idRealiza;
		this.nota = nota;
		this.matricula = matricula;
		this.prova = prova;
	}

	public int getIdRealiza() {
		return idRealiza;
	}

	public void setIdRealiza(int idRealiza) {
		this.idRealiza = idRealiza;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}
	
	public void atribuirNota(float nota) {
		
	}

}
