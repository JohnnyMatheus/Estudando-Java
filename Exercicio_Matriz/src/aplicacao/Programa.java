package aplicacao;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Fazer um programa para ler un Numero inteiro N e uma matriz de ordem N contendo números
 * inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da
 * matriz
 */
public class Programa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Matriz: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();

			}

		}
		System.out.println("Diagonal Principal:");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		int contador = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}

		System.out.println("Números negativos: " + contador);
		sc.close();
	}

}
