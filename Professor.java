package model;

public class Professor {
	private String cpf, nome, endereco, telefone, especialidade;
	private int idProfessor, matricula, idade;
	private Prova prova;
	private Realiza realizada;

	public Professor(String cpf, String nome, String endereco, String telefone, String especialidade, int idProfessor, int matricula,
			int idade, Prova prova, Realiza realizada) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.especialidade = especialidade;
		this.idProfessor = idProfessor;
		this.matricula = matricula;
		this.idade = idade;
		this.prova = prova;
		this.realizada = realizada;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getIdAluno() {
		return idProfessor;
	}

	public void setIdAluno(int idProfessor) {
		this.idProfessor = idProfessor;
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

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}
	
	public Realiza getRealizada() {
		return realizada;
	}
	
	public void setRealizada(Realiza realizada) {
		this.realizada = realizada;
	}
	
	public void cadastrarProva(Prova prova) {
		
	}
	
	public void lancarNota(Realiza realizada) {
		
	}

}
