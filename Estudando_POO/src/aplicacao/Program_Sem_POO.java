package aplicacao;

import java.util.Locale;
//EXEMPLO SEM POO
import java.util.Scanner;

public class Program_Sem_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com as medidas do triângulo x: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();

		System.out.println("Entre com as medidas do triângulo Y: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();

		double p = (xa + xb + xc) / 2;
		double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

		p = (ya + yb + yc) / 2;
		double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - xc));

		System.out.println("Triângulo X area: " + areaX);
		System.out.println("Triângulo Y area: " + areaY);

		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else if (areaY > areaX) {
			System.out.println("Maior área: Y");
		} else {
			System.out.println("Iguais");
		}
		sc.close();
	}

}
