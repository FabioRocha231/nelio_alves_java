package java_nelio_1;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.println("Boa tarde!!!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("TEXTO1 %f TEXTO2 %f TEXTO3%n", x, x + 1);
	}
}
