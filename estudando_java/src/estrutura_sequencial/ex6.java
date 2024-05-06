package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.*/
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double A, B, C, calc;
		System.out.print("Informe valor de A: ");
		A = sc.nextDouble();
		System.out.print("Informe valor de B: ");
		B = sc.nextDouble();
		System.out.print("Informe valor de C: ");
		C = sc.nextDouble();
		System.out.printf("TRIÂNGULO: %3f%n",A*C/2);
		System.out.printf("CIRCULO: %.3f%n", Math.PI* Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f%n",(A+B)*C/2);
		System.out.printf("QUADRADO: %.3f%n",Math.pow(B, 2));
		System.out.printf("RETANGULO: %.3f%n",A*B);
		

	}

}
