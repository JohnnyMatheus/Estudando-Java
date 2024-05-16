import java.util.Scanner;
import java.util.Locale;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
 *o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
 *considerando a primeira posição como 0 (zero). 
 */
public class Ex4_vetor_maior_posicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		double[] numero = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numero[i] = sc.nextDouble();
		}
		double maior = 0;
		int posicao =0;
		for (int i = 0; i < n; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
				posicao =i;
			}
		}
		System.out.printf("MAIOR VALOR: %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR: "+ posicao);

		sc.close();
	}

}
