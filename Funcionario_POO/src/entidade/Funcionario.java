package entidade;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double SalarioLiquido() {
		return salarioBruto - 1000;
	}

	
	public void AumentoSalario(double percentual) {
		salarioBruto += (salarioBruto * percentual) / 100;
	}
	public String toString() {
		return "Funcionário: " + nome + ", R$ " + String.format("%.2f%n", SalarioLiquido())
		;
			   
	}

	
}
