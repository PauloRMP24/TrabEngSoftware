package model;

public class Questao {
	private int idQuestao, numero;
	private String texto;
	private float valor;
	private Prova prova;
	
	public Questao(int idQuestao, int numero, String texto, float valor, Prova prova) {
		this.idQuestao = idQuestao;
		this.numero = numero;
		this.texto = texto;
		this.valor = valor;
		this.prova = prova;
	}

	public int getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}
}
