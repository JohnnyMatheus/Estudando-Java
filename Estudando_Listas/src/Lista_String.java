import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		System.out.println("#ADICIONAR ITENS A LISTA: ");
		lista.add("Johnny");
		lista.add("Matheus");
		lista.add("Java");
		lista.add("Ciência");
		lista.add("Computação");

		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("________________________________________");
		System.out.println("Inserir novo elemento em uma posicao");
		lista.add(1, "Python é uma bosta");
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("________________________________________");
		System.out.println("Ver o tamanho da lista");
		System.out.println(lista.size());

		System.out.println("________________________________________");
		System.out.println("Remover itens da lista");
		lista.remove("Johnny");
		lista.remove(0);

		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("________________________________________");
		System.out.println("// remover elemento por predricado");
		lista.removeIf(nome -> nome.charAt(0) == 'M');

		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("________________________________________");
		System.out.println("Encontrar a posição de um elemento: ");
		System.out.println("Index of Java: "+ lista.indexOf("Java"));
		
		System.out.println("________________________________________");
		List<String> result = lista.stream().filter(nome -> nome.charAt(0) =='C').collect(Collectors.toList());

		for (String nome : result) {
			System.out.println(nome);
		}
		System.out.println("________________________________________");
		String name = lista.stream().filter(nome -> nome.charAt(0) =='J').findFirst().orElse(null);
		System.out.println(name);
	}

}
