import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner (System.in);
		System.out.print("Introduzca su peso en Kg: ");
		double Kg = Teclado.nextDouble();
		System.out.print("Introduzca su altura en m: ");
		double m = Teclado.nextDouble();
		double IMC = Kg / Math.pow(m, 2);
		System.out.printf("Su índice de masa corporal (IMC) es igual a %.3f", IMC);
	}
}
