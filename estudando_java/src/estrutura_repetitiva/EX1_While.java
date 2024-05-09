package estrutura_repetitiva;
import java.util.Scanner;
/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 * */
public class EX1_While {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.err.println("Senha inválida");
			System.out.print("Informe a senha: ");
			senha = sc.nextInt();
			
			
		}
		
		System.out.println("Acesso Permitido");
	}

}
//EX1_While