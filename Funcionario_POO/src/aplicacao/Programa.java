package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Funcionario;

/*Fazer um programa para ler os dados de um funcionário(nome,salário bruto e imposto).
 * Em seguida, mostrar os dados do funcionário(nome e salário líquido).Em seguida, aumentar o 
 * salário do funcionário com base em uma porcentagem dada(somente o salário bruto é afetado pela porcentagem)
 *e mostrar novamente os dados do funcionário. 
 * */
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println(funcionario.toString());

		System.out.print("Qual a porcentagem de aumento salarial?: ");
		int porcentagem = sc.nextInt();
		funcionario.AumentoSalario(porcentagem);

		System.out.println("Dados atualizados");
		System.out.println(funcionario.toString());
	}

}
