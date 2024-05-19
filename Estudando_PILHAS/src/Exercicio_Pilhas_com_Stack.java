import java.util.Scanner;
/*
Escreva um programa que leia 10 números.Para cada número lido, verifique e codifique de acordo com as regras a seguir:
Se o número for par, empilhe
Se o número for ímpar, desempilhe um número existente na pilha.Caso a pilha esteja vazia, mostre uma mensagem informando isso.
Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, mostrando-os na tela.
*/
import java.util.Stack;

public class Exercicio_Pilhas_com_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> pilha = new Stack<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d° número: %n", i + 1);
			int n = sc.nextInt();
			if (n % 2 == 0) {
				pilha.push(n);
			} else {
				if (pilha.isEmpty()) {
					System.out.println("Vazio");

				} else {
					int desempilha = pilha.pop();
					System.out.println("Desempilhado: " + desempilha);
				}
			}

		}
		System.out.println("Desempilhados");
		while (!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}
	}
}