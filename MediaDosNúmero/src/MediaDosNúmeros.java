import java.util.Scanner;

public class MediaDosNúmeros {

	public static void main(String[] args) {
		
		Scanner Teclado = new Scanner (System.in);

		System.out.print("Introduzca primer número entero: ");
		int N1 = Teclado.nextInt ();
		System.out.print("Introduzca segundo número entero: ");
		int N2 = Teclado.nextInt ();

		int M = (N1+N2) / 2;
		System.out.printf("La media de los números %d y %d es igual a %d", N1, N2, M);
	}

}
