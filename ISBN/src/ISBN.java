import java.util.Scanner;
public class ISBN {

	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		int suma = 0;
		int ISBN = 0;
		for (int i=1;i<=10;i++) {
			System.out.print("Introduzca valor del ISBN: ");
			int n = teclado.nextInt();
			ISBN = ISBN*10+n;
			System.out.printf("ISBN: %d",ISBN);
			suma = suma + n*i;
		}
		if (suma%11==0) {
			System.out.printf("El ISBN: %d es válido.", ISBN);
		} else {
			System.out.printf("El ISBN: %d no es válido.", ISBN);
		}
	}
}
