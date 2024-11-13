package model;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	private int idAluno, matricula, idade;
	private String nome, endereco, telefone;
	private List<Matricula> matriculas;

	public Aluno(int idAluno, int matricula, int idade, String nome, String endereco, String telefone) {
		super();
		this.idAluno = idAluno;
		this.matricula = matricula;
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.matriculas = new ArrayList<>();
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	
	public void realizarMatricula(int matricula) {
		
	}
	
}
