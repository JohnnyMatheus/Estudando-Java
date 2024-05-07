package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
//A seguir, calcule e mostre o valor da conta a pagar.

//Código |Especificação  |	PREÇO
// 1      Cachorro Quente	R$ 4.00
// 2      X-Salada			R$ 4.50
// 3	  X- Bacon			R$ 5.00
// 4	  Torrada simples	R$ 2.00
// 5	  Refrigerante		R$ 1.50

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int codigo, qtd;
		double cachorroQuente = 4.00, X_Salada = 4.50, X_Bacon = 5.00, TorradaSimples = 2.00, refrigerante = 1.50;

		System.out.println("CODIGO    |ESPECIFICAÇÃO     |PREÇO");
		System.out.println("  1         Cachorro Quente   R$ 4.00");
		System.out.println("  2         X-Salada	      R$ 4.50");
		System.out.println("  3         X- Bacon          R$ 5.00");
		System.out.println("  4         Torrada simples   R$ 2.00");
		System.out.println("  5         Refrigerante      R$ 1.50");
		System.out.print("Informe o código: ");
		codigo = sc.nextInt();
		System.out.print("Informe a quantidade: ");
		qtd = sc.nextInt();
		double total;
		switch (codigo) {
		case 1:
			total = cachorroQuente * qtd;
			System.out.printf("Total R$ %.2f", total);
			break;
		case 2:
			total = (double) X_Salada * qtd;
			System.out.printf("Total R$ %.2f", total);
			break;
		case 3:
			total = (double) X_Bacon * qtd;
			System.out.printf("Total R$ %.2f", total);
			break;
		case 4:
			total = (double) TorradaSimples * qtd;
			System.out.printf("Total R$ %.2f", total);
			break;

		case 5:
			total = (double) refrigerante * qtd;
			System.out.printf("Total R$ %.2f", total);
			break;
		default:
			System.out.println("Código inválido");
			break;

		}

	}

}
