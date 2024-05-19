
import java.util.Scanner;
import java.util.Stack;

public class teste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> pilha = new Stack<>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			if (numero % 2 == 0) {
				pilha.push(numero);
			} else {
				if (!pilha.isEmpty()) {
					int elementoDesempilhado = pilha.pop();
					System.out.println("Desempilhado: " + elementoDesempilhado);
				} else {
					System.out.println("A pilha está vazia.");
				}
			}
		}

		System.out.println("\nElementos restantes na pilha:");
		while (!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}
	}
}
