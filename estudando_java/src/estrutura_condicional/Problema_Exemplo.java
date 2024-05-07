package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*PROBLEMA EXEMPLO
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos
 * de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa
 * para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 * */

public class Problema_Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double plano = 50.00;
		double minutoExcedido = 2.00;
		System.out.println("Informe a quantidade de minutos consumidos: ");
		int qtdMinutos = sc.nextInt();
		if (qtdMinutos <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f%n", plano);
		} else {
			double calc = (double) (qtdMinutos - 100) * minutoExcedido;
			System.out.printf("Valor a pagar: R$ %.2f", (calc + plano));
		}

		sc.close();
	}

}
