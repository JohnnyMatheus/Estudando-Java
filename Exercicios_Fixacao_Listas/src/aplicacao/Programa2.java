package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

/*Fazer um programa para ler um número inteiro N e depois os dados(id,nome e salario) de N funcionários.
 * Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma 
 * mensagem e abortar a operação.Ao final, mostrar a listagem atualizada dos funcionários, conforme 
 * exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o saário possa ser mudado
 * livremente . Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
 */
public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos funcionários deseja digitar: ");
		int n = sc.nextInt();
		List<Funcionario> lista = new ArrayList<Funcionario>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Código: ");
			Integer codigo = sc.nextInt();
			while(verificaCodigo(lista, codigo)) {
				System.out.println("Esse código já existe");
				codigo =sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(codigo, nome, salario);
			lista.add(funcionario);

		}
		System.out.print("Entre com o codigo do funcionario que tera aumento salarial: ");
		int codigoSalario = sc.nextInt();
		
		Funcionario  funcionario= lista.stream().filter(codigo -> codigo.getCodigo() == codigoSalario).findFirst().orElse(null);
		
		if (funcionario == null) {
			System.out.println("Este Codigo não existe");
		} else {
			System.out.print("Entre com a porcentagem ");
			double porcentagem = sc.nextDouble();
			funcionario.aumentoSalario(porcentagem);

		}
		System.out.println("Lista de funcionários");
		for (Funcionario funcionarios : lista) {
			System.out.println(funcionarios);
		}

		sc.close();
	}

	public static Integer posicao(List<Funcionario> lista, int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == codigo) {
				return i;
			}
		}
		return null;
	}

	public static boolean verificaCodigo(List<Funcionario> lista, int codigo) {
		Funcionario funcionario = lista.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);	
		return funcionario != null;
	}

}
