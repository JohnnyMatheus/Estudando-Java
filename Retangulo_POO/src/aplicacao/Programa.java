package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;

/*Fazer um programa para ler os valores da largura e altura
 * de um retângulo. Em seguida, mostrar na tela o valor de 
 * sua área, perímetro e diagonal.
 * */
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();
		System.out.print("Informe a largura: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Informe a altura: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		

	}

}
