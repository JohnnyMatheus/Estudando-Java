package aplicacaopessoa;

/*
*Construir um programa para ler o nome e a idade de uma pessoa (atributos da classe) e
*faça alguns aniversários para essa pessoa (método). Em seguida mostre a idade atual
*da pessoa, depois de fazer aniversário 
*/
import java.util.Scanner;

import entidadepessoa.Pessoa;

public class ProgramaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();
		System.out.print("Nome: ");
		pessoa.nome = sc.nextLine();
		System.out.print("Idade: ");
		pessoa.idade = sc.nextInt();

		System.out.println();
		System.out.println("Nome: " + pessoa.nome + "Idade: " + pessoa.idade);

		System.out.println("Idade depois que fizer aniversário");
		pessoa.fazAniversario();
		System.out.println(pessoa.getIdade());

	}

}
