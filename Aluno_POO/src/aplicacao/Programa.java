package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Estudante;

/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos tês trimestres do ano
*(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).Ao final, mostrar qual a nota final do
*aluno no ano.Dizer também se o aluno está aprovado(PASS) ou não (FAILED)e, em caso negativo, quantos pontos
*faltam para o aluno obter o mínimo para ser aprovado(que é 60% da nota).Você deve criar um classe Student para
*resolver este problema.
*/
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante estudante = new Estudante();
		System.out.println("Nome: ");
		estudante.nome = sc.nextLine();
		
		System.out.println("Nota1: ");
		estudante.nota1 =sc.nextDouble();
		System.out.println("Nota2: ");
		estudante.nota2 = sc.nextDouble();
		System.out.println("Nota3: ");
		estudante.nota3 =sc.nextDouble();
		
		System.out.println(estudante.toString());
		
		if(estudante.NotaFinal()>60) {
			System.out.println("Passou");
		}else {
			System.out.println("Falha");
			System.out.printf("Faltam: %.2f Pontos",estudante.PontosFaltantes());
		}
		
		
		
		
		
		
		

	}

}
