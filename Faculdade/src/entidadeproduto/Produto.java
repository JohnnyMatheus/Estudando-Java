package entidadeproduto;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorEstoque() {
		return preco * quantidade;
	}

	public void acrescentarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void RetirarProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", valor Estoque="
				+ valorEstoque() + "]";
	}

	
	
	
}
