package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String  titular = sc.nextLine();
		System.out.print("Existe deposito inicial (y/n)?: ");
		char opcao = sc.next().charAt(0);
		if(opcao == 'y') {
			System.out.print("Entre com valor do deposito inicial: ");
			double depositoIncial =sc.nextDouble();
			conta = new Conta(numero,titular,depositoIncial);
		}else {
			conta = new Conta(numero,titular);
		}
		
		System.out.println();
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		System.out.println();
		System.out.print("Entre com valor de deposito: ");
		double deposito = sc.nextDouble();
		conta.Deposito(deposito);
		System.out.println("Dados atualizados da Conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Entre com valor de saque: ");
		double saque = sc.nextDouble();
		conta.Saque(saque);
		System.out.println("Dados atualizados da Conta: ");
		System.out.println(conta);
		System.out.println();
		
		sc.close();
	}

}
