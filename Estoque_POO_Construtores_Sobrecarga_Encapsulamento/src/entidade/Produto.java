package entidade;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
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
