import java.util.Scanner;
import java.util.Locale;
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 *aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 *digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

public class EX7_media_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();

		}
		double soma = 0.0;
		int par = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				par++;

			}

		}
		if (par == 0) {
			System.out.println("NENHUM É PAR");
		} else {
			double media = soma / par;
			System.out.println("Média dos pares: " + media);
		}

	}

}
