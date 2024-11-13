package model;

import java.util.List;

public class Prova {
	private int idProva, codigo;
	private float peso;
	private String data;
	private Turma turma;
	private List<Questao> questoes;
	
	public Prova(int idProva, int codigo, String data, float peso, Turma turma, List<Questao> questoes) {
		this.idProva = idProva;
		this.codigo = codigo;
        this.data = data;
        this.peso = peso;
        this.turma = turma;
        this.questoes = questoes;
	}

	public int getIdProva() {
		return idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
	public void adicionarQuestao(Questao questao) {
		
	}
	
	public void removerQuestao(Questao questao) {
		
	}

}
