package entidade;

public class Estudante {
	public String nome;
	public double nota1,nota2,nota3;
	
	public double NotaFinal() {
		return nota1+nota2+nota3;
	}
	
	public double PontosFaltantes() {
		if(NotaFinal()<60.0) {
			return 60.0 - NotaFinal();
		}else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "Nota final: "+String.format("%.2f",NotaFinal());
	}
}
