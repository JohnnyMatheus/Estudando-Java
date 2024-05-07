package estrutura_condicional;

import java.util.Scanner;

/*Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
 * (sendo 1 = domingo, 2 = segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente.*/
public class Problema_Exemplo2_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um valor de 1 a 7: ");
		int valor = sc.nextInt();

		switch (valor) {
		case 1:
			System.out.println("Dia da semana: Domingo");
			break;
		case 2:
			System.out.println("Dia da semana: Segunda-feira");
			break;
		case 3:
			System.out.println("Dia da semana: Terça-feira");
			break;
		case 4:
			System.out.println("Dia da semana: Quarta-feira");
			break;
		case 5:
			System.out.println("Dia da semana: Quinta-feira");
			break;
		case 6:
			System.out.println("Dia da semana: Sexta-feira");
			break;
		case 7:
			System.out.println("Dia da semana: Sabado");
			break;
		default:
			System.out.println("Valor inválido!");
			break;

		}
	}

}
