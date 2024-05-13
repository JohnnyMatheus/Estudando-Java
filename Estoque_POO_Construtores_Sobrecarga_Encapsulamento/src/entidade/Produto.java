package entidade;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double ValorTotalEstoque() {
		return preco * quantidade;
	}

	public void AddProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void RemoverProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "Nome: " + nome + ", " + "Preço Unitário: R$" + String.format("%.2f", preco) + ", " + "Quantidade: "
				+ quantidade + ", " + "Valor Total: R$" + String.format("%.2f", ValorTotalEstoque());
	}

}
