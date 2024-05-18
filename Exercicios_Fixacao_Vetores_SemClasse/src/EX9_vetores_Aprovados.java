import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
*no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
*os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
*igual a 6.0 (seis).  
 */
public class EX9_vetores_Aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] primeiroSemestre = new double[n];
		double[] segundoSemestre = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados do %d° aluno:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Primera nota: ");
			primeiroSemestre[i] = sc.nextDouble();
			System.out.print("Segunda nota: ");
			segundoSemestre[i] = sc.nextDouble();
		}

		System.out.println("Aprovados:");
		double media = 0;
		for (int i = 0; i < n; i++) {
			media = (primeiroSemestre[i] + segundoSemestre[i]) / 2;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		System.out.println("Reprovados");

		for (int i = 0; i < n; i++) {
			media = (primeiroSemestre[i] + segundoSemestre[i]) / 2;
			if (media < 6.0) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}