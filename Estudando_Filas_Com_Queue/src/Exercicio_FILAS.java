import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
/*Construir um programa que leia 10 números inteiros e os insira em uma pilha.  
 * Em seguida devem ser lidos, um a um, 5 operadores que podem ser  “+”, ”-“ , “*”  ou  “/” , 
 * dois elementos de cada vez devem ser retirados da pilha e o resultado da operação 
 * entre eles deve ser inserido em uma fila.  No final, a fila com os resultados deve ser mostrada.
 * */
public class Exercicio_FILAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> pilha = new Stack<Integer>();
		Queue <Integer> fila = new LinkedList<Integer>();
		for(int i =0;i<10;i++) {
			System.out.println("Informe o  "+i+"° numero: ");
			int n = sc.nextInt();
			pilha.push(n);
		}
		
		for(int i = 0; i<5;i++) {
			System.out.println("Digite um operador: + | - | * | / |");
			char operador = sc.next().charAt(0);
		}
		
		
		
	}

}
