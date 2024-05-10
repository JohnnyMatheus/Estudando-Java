package operadoresBitwise;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int mascara = 0b00100000;
		System.out.print("Informe um número: ");
		int n = sc.nextInt();
		if ((n & mascara) != 0) {
			System.out.println("6° bit é verdadeiro!");
		} else {
			System.out.println("6° bit é falso!");
		}

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

	}

}
