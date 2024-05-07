package estrutura_condicional;
import java.util.Scanner;
/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * */
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = sc.nextInt();
		if(numero%2 ==0) {
			System.out.print("O NÚMERO DIGITADO É PAR");
		}else {
			System.out.print("O NÚMERO DIGITADO É IMPAR");
		}
		
	}

}
