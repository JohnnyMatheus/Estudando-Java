package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por hora e calcula o salário desse
 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
 * casas decimais
 * 
 */

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numFuncionario, horasTrabalhadas;
		double valorHora, salario;

		System.out.print("Informe o número do funcionário: ");
		numFuncionario = sc.nextInt();
		System.out.println("Informe quantas horas trabalhou: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Informe o valor R$ da hora trabalhada: ");
		valorHora = sc.nextDouble();
		salario = (double) horasTrabalhadas * valorHora;
		System.out.println("Número = " + numFuncionario);
		Locale.setDefault(Locale.US);
		System.out.printf("Salário R$ = %.2f", salario);
		sc.close();
	}

}
