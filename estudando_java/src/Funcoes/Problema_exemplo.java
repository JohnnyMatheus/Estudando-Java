package Funcoes;

import java.util.Scanner;
//Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

public class Problema_exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com três números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int maior = Maior(n1, n2, n3);

		Resultado(maior);
		sc.close();
	}

	public static int Maior(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}

		return aux;
	}
	
	public static void Resultado(int valor) {
		System.out.println("Maior = "+ valor);
	}

}
