package entidade;

public class Retangulo {
	public double largura;
	public double altura;

	public double Area() {
		return largura * altura;
	}

	public double Perimetro() {
		return (largura * 2) + (altura * 2);
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	public String toString() {
		return "Area: "+String.format("%.2f%n",Area())+
				"Perimetro: "+String.format("%.2f%n",Perimetro())+
				"Diagonal: "+String.format("%.2f%n", Diagonal());
	}
	
	

}
