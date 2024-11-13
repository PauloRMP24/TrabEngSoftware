package model;

public class Disciplina {
	private int idDisciplina,codigo, credito;
	private String nome;

	public Disciplina(int idDisciplina, int codigo, int credito, String nome) {
		super();
		this.idDisciplina = idDisciplina;
		this.codigo = codigo;
		this.credito = credito;
		this.nome = nome;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
