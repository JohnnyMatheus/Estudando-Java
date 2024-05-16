import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
 *tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
 *bem como os nomes dessas pessoas caso houver. 
 */

public class Ex3_vetor_alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantos dados deseja ler: ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %d° pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		int menores = 0;
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += altura[i];
			if (idade[i] > 16) {
				menores++;
			}
		}
		double alturaMedia = soma / altura.length;
		double percentual = ((double) menores / n) * 100;

		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentual);
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}

}
