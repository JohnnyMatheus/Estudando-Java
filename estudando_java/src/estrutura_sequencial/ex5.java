package estrutura_sequencial;

import java.util.Scanner;
import java.nio.file.spi.FileSystemProvider;
import java.util.Locale;

/**
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 *
 */

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Código: ");
		int codigo1 = sc.nextInt();
		System.out.print("Numero de peças : ");
		int numeroPecas1 = sc.nextInt();
		System.out.print("Valor unitário peça 1: ");
		double valorUnitario1 = sc.nextDouble();
		System.out.println();
		System.out.print("Código2: ");
		int codigo2 = sc.nextInt();
		System.out.print("Numero de peças2 : ");
		int numeroPecas2 = sc.nextInt();
		System.out.print("Valor unitário peça 2: ");
		double valorUnitario2 = sc.nextDouble();
		
		double calc1 = (double)numeroPecas1*valorUnitario1;
		double calc2 = (double)numeroPecas2*valorUnitario2;
		double valorTotal = calc1+calc2;
		Locale.setDefault(Locale.US);
		System.out.printf("VALOR A PAGAR: R$ %.2f",valorTotal);
		
		sc.close();
		
	}

}
