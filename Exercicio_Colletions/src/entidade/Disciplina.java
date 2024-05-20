package entidade;

public class Disciplina {
	private int codigo;
	private String nome;
	private int fase;
	private int cargaHoraria;

	public Disciplina(int codigo, String nome, int fase, int cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.fase = fase;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String toString() {
		return "Disciplina{" + "codigo= " + codigo + ", nome= " + nome + ", fase= " + fase + ", cargaHoraria="
				+ cargaHoraria + '}';
	}
}
