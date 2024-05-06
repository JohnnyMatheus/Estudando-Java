package estrutura_sequencial;

public class ProcessamentoDeDados_E_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("//Exemplo 1");
		
		int x1, y1;

		x1 = 5;

		y1 = 2 * x1;

		System.out.println(x1);
		System.out.println(y1);

		System.out.println();

		System.out.println("//Exemplo 2");
		

		int x2;
		double y2;
		x2 = 5;

		y2 = 2 * x2;

		System.out.println(x2);
		System.out.println(y2);
		System.out.println();
		
		System.out.println("//Exemplo 3");
		
		double h = 5.0, B = 8.0, b = 6.0, area;

		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		System.out.println();
		
		System.out.println("//Exemplo 4");
		
		int num1,num2;
		double resultado;
		
		num1 = 5;
		num2 = 2;
		
		resultado = num1/num2;
		System.out.println(resultado); //deveria dar 2,5 mas ocorre a divisao de inteiros => expressão de números inteiros o resultado é inteiro
		//corta as casas decimais ai usamos um casting para dar resultado correto 2,5;
		
		//Fica assim usando casting

		int num3,num4;
		double resultado2;
		
		num3 = 5;
		num4 = 2;
		
		resultado2 = (double)num3/num4;
		System.out.println(resultado2);
		
		System.out.println("//Exemplo 5");
		
		/*double num5;
		int num6;
		num5 = 50.0;
		num6 =num5; ,//
		System.out.println(num6);  */ //Vai dar erro pois o compilador acha que iremos perder informação ai temos que usar um casting
		
		double num5;
		int num6;
		num5 = 5.0;
		num6 = (int) num5; //usando casting avisamos o compilador q n importa as casas decimais 
		System.out.println(num6);
		
		
	}

}
