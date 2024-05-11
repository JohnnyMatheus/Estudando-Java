package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		// ENTRADA DE DADOS
		System.out.print("Nome do Produto: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço do Produto: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade do Produto: ");
		produto.quantidade = sc.nextInt();

		System.out.println("#DADOS DO PRODUTO");
		System.out.println("Nome: " + produto.nome);
		System.out.printf("Preço unitário: R$ %.2f%n", produto.preco);
		System.out.println("Quantidade: " + produto.quantidade);
		System.out.printf("Valor Total Estoque: R$ %.2f%n", produto.ValorTotalEstoque());

		System.out.println("ADICIONAR QUANTIDADE NO ESTOQUE");
		System.out.println("Entre com a quantidade que deseja adicionar no estoque:");
		int add = sc.nextInt();
		produto.AddProdutos(add);

		System.out.println("DADOS ATUALIZADO");
		System.out.println("Nome: " + produto.nome);
		System.out.printf("Preço unitário: R$ %.2f%n", produto.preco);
		System.out.println("Quantidade: " + produto.quantidade);
		System.out.printf("Valor Total Estoque: R$ %.2f%n", produto.ValorTotalEstoque());

		System.out.println("REMOVER PRODUTOS");
		System.out.print("Informe a quantidade que deseja remover do estoque: ");
		int remover = sc.nextInt();
		produto.RemoverProdutos(remover);

		System.out.println("DADOS ATUALIZADO");
		System.out.println("Nome: " + produto.nome);
		System.out.printf("Preço unitário: R$ %.2f%n", produto.preco);
		System.out.println("Quantidade: " + produto.quantidade);
		System.out.printf("Valor Total Estoque: R$ %.2f%n", produto.ValorTotalEstoque());
		sc.close();
	}
	
}
