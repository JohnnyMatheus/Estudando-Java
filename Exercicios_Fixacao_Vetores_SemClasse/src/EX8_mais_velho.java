import java.util.Scanner;
import java.util.Locale;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 *devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 *da pessoa mais velha. 
 * 
 * */

public class EX8_mais_velho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %d° pessoa: %n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		int maisVelho = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				System.out.println("Pessoa mais velha: " + nome[i]);
			}
		}

		sc.close();
	}

}
