import java.util.Locale;
import java.util.Scanner;
import entidade.Aluguel;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vetor = new Aluguel[10];

		System.out.print("Quantos quartos serão alugados: ");
		int n = sc.nextInt();

		for (int i = 1; i <=n; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int numeroQuarto = sc.nextInt();
			vetor[numeroQuarto] = new Aluguel(nome, email);
		}
		System.out.println("Quartos ocupados: ");
		for(int i=0;i<10;i++) {
			if(vetor[i] !=null) {
				System.out.println(i+": "+vetor[i]);
			}
		}
		sc.close();
	}

}
