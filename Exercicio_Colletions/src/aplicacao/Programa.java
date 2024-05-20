package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entidade.Disciplina;

/*Utilize a classe Disciplina (código, nome, fase e carga horária ) para construir um programa 
 * para manter uma lista de disciplinas.   Ordene a lista de acordo com o nome das disciplinas.  
 * Lembre de modificar a classe Disciplina para que a ordenação se dê pelo nome das disciplinas.
 *   Teste os recursos discutidos em aula.
 * */
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Disciplina> disciplinas = new ArrayList<>();
		disciplinas.add(new Disciplina(1,"Programacao I",3,80));
		disciplinas.add(new Disciplina(2,"Desenvolvimento WEB",3,80));
		disciplinas.add(new Disciplina(2,"Matemática 3",3,80));
		
		
		 for (Disciplina disciplina : disciplinas) {
	            System.out.println(disciplina);
			
		}
	}

}
