package estrutura_repetitiva_While;

import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler uma temperatura em celsius e mostrar o equivalente em Fahrenheit.
 * Perguntar se o usuário deseja repetir (s/n).Caso o usuário digite "s",repetir o programa.
 * Fórmula: F = 9*c/5+32
 * */

public class Problema_ex_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char op;
		double f;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			f = 9 * c / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja continuar (s/n)");
			op = sc.next().charAt(0);
		} while (op != 'n');
		sc.close();
	}

}
