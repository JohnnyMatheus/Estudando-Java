package entidade;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;

	}

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		Deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

//////////////////////////////////////////////

	public void Deposito(double quantia) {
		this.saldo += quantia;
	}

	public void Saque(double quantia) {
		this.saldo -= quantia + 5.0;
	}

	public String toString() {
		return "Conta: " + numero + ", Titular: " + titular + ", Saldo: R$ " + String.format("%.2f", saldo);
	}
}
