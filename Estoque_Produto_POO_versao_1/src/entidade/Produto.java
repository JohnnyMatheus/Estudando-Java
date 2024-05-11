package entidade;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double ValorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void AddProdutos(int quantidade) {
		this.quantidade +=quantidade;
	}
	
	public void RemoverProdutos(int quantidade) {
		this.quantidade -=quantidade;
	}

}