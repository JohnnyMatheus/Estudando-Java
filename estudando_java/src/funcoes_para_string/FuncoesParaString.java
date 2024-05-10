package funcoes_para_string;

import javax.print.DocFlavor.INPUT_STREAM;

public class FuncoesParaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcde FGHIJ ABC abc DEFG   ";
		System.out.println("Original: " + original);
		System.out.println();
		System.out.println("//Tudo minusculo");
		String tudoMinusculo = original.toLowerCase();
		System.out.println(".toLowerCase()->tudo minusculo: -" + tudoMinusculo + "-");
		System.out.println();

		System.out.println("//Tudo Maiusculo");
		String tudoMaiusculo = original.toUpperCase();
		System.out.println(".toUpperCase() ->tudo maiusculo: -" + tudoMaiusculo + "-");
		System.out.println();

		System.out.println("//Remover espaços");
		String removerEspaco = original.trim();
		System.out.println(".trim() -> remover espaços: -" + removerEspaco + "-");
		System.out.println();

		System.out.println("Substring EX1");
		String substring = original.substring(2);
		System.out.println(".substring(2): " + substring); // começa da posição 2 em diante e gera uma nova string do
															// caracter C em diante
		System.out.println();

		System.out.println("Substring EX2");
		String substring2 = original.substring(2, 9);// significa que vai recorta do 2 e abaixo do caracter 9 -> da
														// letra c ate a letra h
		System.out.println(".substring(2,9): " + substring2);
		System.out.println();

		System.out.println("Substituir EX1");
		String substituir = original.replace('a', 'x');
		System.out.println(".replace('a','x')" + substituir); // substitui o todos os caracter a por x
		System.out.println();

		System.out.println("Substituir EX2 em uma substring");
		String substituir2 = original.replace("abc", "xyz");
		System.out.println(".replace('abc','xyz'): " + substituir2);
		System.out.println();

		int i = original.indexOf("bc");
		System.out.println("indexOf(): " + i);

		int j = original.lastIndexOf("bc");
		System.out.println("lastIndexOf(): " + j);

	}

}
