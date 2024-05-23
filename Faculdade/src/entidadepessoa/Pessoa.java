package entidadepessoa;

public class Pessoa {
	public String nome;
	public int idade;

	public Pessoa() {}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void fazAniversario() {
		idade++;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
