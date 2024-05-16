import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
*mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
*os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.  
*/
public class Ex6_abaixo_da_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o %d°:%n ", i + 1);
			vetor[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;

		System.out.println("Media do vetor: " + media);

		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f%n ",vetor[i]);
			}
			
		}
	sc.close();
	}

}
