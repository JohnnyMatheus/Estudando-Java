package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cotacao;

//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa
//em reiais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá
//que pagar 6% de IOF sobre o valor em dólar.Criar um classe CurrencyConverter para ser responsãvel pelos calculos


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cotacao cotacao = new Cotacao();
		System.out.print("Qual o preço do dolar: ");
		cotacao.preco_dolar = sc.nextDouble();
		System.out.print("Quantos dolares deseja comprar: ");
		cotacao.real = sc.nextDouble();
		
		System.out.println(cotacao.toString());
		
		
		
		
		
		
		
		
	}

}
