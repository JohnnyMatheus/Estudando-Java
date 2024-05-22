package aplicacaoproduto;

import java.util.Scanner;
import java.util.Locale;
import entidadeproduto.Produto;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.print("Informe nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Informe o preco: ");
		produto.preco = sc.nextDouble();
		System.out.print("Adicionar quantidade: ");
		int qtd = sc.nextInt();
		produto.acrescentarProduto(qtd);
		
		System.out.println("DADOS PRODUTO: ");
		System.out.println(produto);
		
		
		System.out.print("Adicionar quantidade: ");
		qtd = sc.nextInt();
		produto.acrescentarProduto(qtd);
		
		System.out.println("DADOS PRODUTO: ");
		System.out.println(produto);
		
		System.out.print("Remover quantidade: ");
		int remover = sc.nextInt();
		produto.RetirarProduto(remover);
		
		
		System.out.println("DADOS PRODUTO: ");
		System.out.println(produto);
		
	}

}
