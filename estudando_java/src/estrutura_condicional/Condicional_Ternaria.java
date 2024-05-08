package estrutura_condicional;

import java.util.Scanner;

public class Condicional_Ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();

		double teste = (preco > 10.0) ? 20.0 : 22.0;
		System.out.println(teste);

	}

}
