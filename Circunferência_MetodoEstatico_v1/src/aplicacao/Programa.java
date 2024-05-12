package aplicacao;

import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma
*circunferência e do volume de uma esfera para um raio daquele valor. Informar tambpem o valor de PI
*com duas casas decimais. 
**/

//PRIMEIRA VERSÃO DO PROGRAMA
public class Programa {
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com valor do raio: ");
		double raio = sc.nextDouble();

		double c = circunferencia(raio);
		double v = volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI valor: %.2f%n", PI);
		sc.close();
	}

	public static double circunferencia(double raio) {
		return 2* PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * Math.pow(raio, 3) / 3;
	}
}
