package entidade;

public class Funcionario {
	private Integer codigo;
	private String nome;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(int codigo, String nome, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setId(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	
	public void aumentoSalario(double porcentagem) {
		salario += salario*porcentagem/100;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	

}
