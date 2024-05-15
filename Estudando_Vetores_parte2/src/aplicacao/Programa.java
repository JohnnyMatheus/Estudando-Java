package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidade.Produto;
/*Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.Armazene os N
 * produtos em um vetor. Em seguida, mostrar o preço médio dos produtos. 
 */

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de iten a serem lidos: ");
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i].getPreco();
		}

		double media = soma / vetor.length;

		System.out.printf("Preço médio : %.2f", media);

		sc.close();
	}

}
