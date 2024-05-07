package estrutura_condicional;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 * */

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = sc.nextInt();
		if(numero<0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
			
		
	}

}
