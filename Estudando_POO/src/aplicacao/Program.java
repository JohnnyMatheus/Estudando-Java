package aplicacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com as medidas do triângulo x: ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double p = (xa+xb+xc)/2;
		double area = Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
		System.out.println("Triângulo X area: "+area);
		
		
		
		
		p = (ya+yb+yc)/2;
		area = Math.sqrt(p*(p-ya)*(p-yb)*(p-xc));
		System.out.println("Triângulo X area: "+area);
		
	}

}
