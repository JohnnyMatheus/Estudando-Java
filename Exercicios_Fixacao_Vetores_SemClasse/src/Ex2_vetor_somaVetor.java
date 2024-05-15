
import java.util.Scanner;
import java.util.Locale;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor 
 * */

public class Ex2_vetor_somaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números serão lidos: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Informe o %d° número: ",i+1);
			vetor[i] = sc.nextInt();
		}
		//Imprimir todos os elementos do vetor
		System.out.print("Valores Lidos: ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println();
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		System.out.println("Soma: "+soma);
		
		double media = soma/vetor.length;
		System.out.println("Média: "+media);


	}

}
