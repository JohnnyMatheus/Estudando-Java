import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
public class Ex1_vetor_negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números serão digitados: ");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Entre com %d° número: ", i + 1);
			vetor[i] = sc.nextInt();
		}

		System.out.println("Números negativos: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	}

}
