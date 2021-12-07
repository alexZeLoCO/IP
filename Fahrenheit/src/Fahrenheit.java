import java.util.Scanner;
public class Fahrenheit {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca los grados Fahrenheit: ");
		double F = teclado.nextDouble();
		System.out.printf("%.3fFº son equivalentes a %.3fCº.",F, (double) (F-32)*5/9);
	}

}
