package entidade;

public class Cotacao {
	public double preco_dolar;
	public double real;
	public double imposto = 6;

	public double ConversorMoeda() {
		double valor = preco_dolar * real;
		double result = valor + (valor * imposto) / 100;

		return result;
	}

	public String toString() {
		return "Valor a ser pago em reais: " + String.format("%.2f", ConversorMoeda());
	}

}
