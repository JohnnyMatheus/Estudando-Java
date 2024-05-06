package estrutura_sequencial;

import java.util.Scanner;

public class EntradaDeDados_Parte1 {

	public static void main(String[] args) {

		// Entrada de dados usamos Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("//ler uma String");
		String x = sc.next();
		System.out.println("Você digitou: " + x);

		System.out.println();

		System.out.println("//ler um valor inteiro:");
		int num = sc.nextInt();
		System.out.println("Você digitou: " + num);

		System.out.println();

		System.out.println("//ler um valor com ponto flutuante");
		double num2 = sc.nextDouble();
		System.out.println("Você digitou: " + num2);

		System.out.println();

		System.out.println("//Para ler um caracter");

		char genero = sc.next().charAt(0);
		System.out.println("Você digitou: " + genero);

		System.out.println();
		System.out.println("Ler vários dados na mesma linha: ");
		String nome;
		int idade;
		double peso;
		nome = sc.next();
		idade = sc.nextInt();
		peso = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(peso);

		sc.close();
	}

}
