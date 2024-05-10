package funcoes_para_string;

public class Operacao_Split {

	public static void main(String[] args) {
		
		 //SPLIT SERVE PARA RECORTAR UM STRING => RECEBE UM SEPARADOR E 
		
		String nome =  "Johnny Matheus Nogueira de Medeiro";
		
		String[] vetor = nome.split(" ");
		String palavra1 = vetor[0];
		String palavra2 = vetor[1];
		String palavra3 = vetor[2];
		String palavra4 = vetor[3];
		String palavra5 = vetor[4];
		
		System.out.println(palavra1);
		System.out.println(palavra2);
		System.out.println(palavra3);
		System.out.println(palavra4);
		System.out.println(palavra5);
		
		
		
	}

}
