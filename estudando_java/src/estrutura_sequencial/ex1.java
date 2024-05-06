package estrutura_sequencial;
import java.util.Scanner;
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos.
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("informe 1° valor: ");
		a = sc.nextInt();
		System.out.println("informe 2° valor: ");
		b =sc.nextInt();
		soma = a+b;
		System.out.println("SOMA = "+soma);
		
		sc.close();
	}

}
