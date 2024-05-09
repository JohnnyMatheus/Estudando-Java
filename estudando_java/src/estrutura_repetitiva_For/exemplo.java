package estrutura_repetitiva_For;

/*Fazer um programa que lê um valor inteiro N e depois N números inteiros.
 * Ao final, mostra a soma dos N números lidos
 * */
import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores deseja ler: ");
		int n = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("informe o %d° valor: %n",i+1);
			int x = sc.nextInt();
			soma+=x;
		}
		System.out.println("A soma dos valores lidos é: "+ soma);
	}
}
