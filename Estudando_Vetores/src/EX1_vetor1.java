import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa para ler um número inteiro N  e a altura de N pessoas.
 *Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */
public class EX1_vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe número: ");
		int n = sc.nextInt();
		double[] vet = new double[n];

		double soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("Informe a altura %d°: ", i + 1);
			vet[i] = sc.nextDouble();
			
		}
		
		
		double media = soma / vet.length;
		System.out.printf("Media alturas: %.2f", media);
		sc.close();
	}
	
}
