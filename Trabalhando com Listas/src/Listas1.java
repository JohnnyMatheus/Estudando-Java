import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Listas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**/
		
		List<String> lista = new ArrayList<>();
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Johnny");
		lista.add("Matheus");
		
		for(String nome:lista) {
		System.out.println(nome);
		}
		
		//Tamanho da lista
		System.out.println(lista.size());
		
	}

}
