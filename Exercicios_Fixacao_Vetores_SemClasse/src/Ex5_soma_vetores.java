import java.util.Scanner;
import java.util.Locale;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
 *terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
 *o vetor C gerado. 
 */
public class Ex5_soma_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores serão lidos: ");
		int n = sc.nextInt();
		double[] A = new double[n];
		double[] B = new double[n];
		double[] C = new double[n];

		System.out.println("Vetor A: ");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextDouble();
		}
		
		System.out.println("Vetor B: ");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextDouble();
		}
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < n; i++) {
			C[i] = A[i]+B[i];
			System.out.println(C[i]);
		}

	}

}