package estrutura_condicional;

import java.util.Scanner;

/*Leia 2 valores inteiros(A e B).Após,o programa deve mostrar uma mensagem"Sao Multiplos"
 * ou"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: 
 * os números devem poder ser digitados em ordem crescente ou decrescente.*/

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe valor de A: ");
		int A = sc.nextInt();
		System.out.print("Informe valor de B: ");
		int B = sc.nextInt();
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}

		sc.close();
	}

}
