package estrutura_repetitiva_For;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma+=x;
		}
		System.out.println(soma);
		sc.close();

	}
}
