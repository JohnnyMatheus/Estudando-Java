package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
 * valor da área deste círculo com quatro casas decimais conforme exemplos.
 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
 */

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double raio, area;
		System.out.print("Informe o valor do raio: ");
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
		
		sc.close();

	}

}
