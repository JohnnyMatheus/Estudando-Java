package estrutura_condicional;

import java.nio.file.spi.FileSystemProvider;

public class ExpressoesComparativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("//EX1");
		int x = 5;
		int c = 10;
		boolean result = x > c;

		System.out.println(result);
		System.out.println();
		System.out.println("//EX2");
		x = 5;
		result = x == 3;
		System.out.println(result);
		System.out.println();
		System.out.println("//EX3");
		x = 5;
		result = x > 3;
		System.out.println(result);

		System.out.println();

		System.out.println("//EX4");
		result = 10 <= 30;
		System.out.println(result);

		System.out.println();
		System.out.println("//EX5");
		x = 5;
		result = x != 2;
		System.out.println(result);
	}

}
