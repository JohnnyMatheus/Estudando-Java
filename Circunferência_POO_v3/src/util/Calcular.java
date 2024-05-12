package util;

public class Calcular {
	public static final double PI = 3.14159;

	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * Math.pow(raio, 3) / 3;
	}

}
