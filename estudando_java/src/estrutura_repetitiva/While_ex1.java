package estrutura_repetitiva;

import java.util.Scanner;

/*Fazer um programa que lê números inteiros até que um zero seja lido.
 *Ao final mostra a soma dos números lidos.
 * */

public class While_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		int soma = 0;
		while (num != 0) {
			soma +=num;
			num = sc.nextInt();
			
		}
		System.out.println("SOMA: "+soma);
		sc.close();
		
	}

}
