import java.util.Scanner;
public class z {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca base y altura de un rect�ngulo (base altura): ");
		double b = teclado.nextDouble();
		double h = teclado.nextDouble();
		double area = b*h;
		System.out.printf("El �rea es: %d", area);
	}

}
