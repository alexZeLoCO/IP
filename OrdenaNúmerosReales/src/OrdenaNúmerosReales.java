import java.util.Scanner;		//IMPORTAR SCANNER
public class OrdenaNúmerosReales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un número: ");		//SOLICITA NÚMERO
		double a = teclado.nextDouble();		//ALMACENA VALOR EN A
		System.out.print("Introduzca un número: ");		//SOLICITA NÚMERO
		double b = teclado.nextDouble();		//ALMACENA VALOR EN B
		System.out.print("Introduzca un número: ");		//SOLICITA NÚMERO
		double c = teclado.nextDouble();		//ALMACENA VALOR EN C
		

		if (a<b) {		//SI A < B
			if (b<c) {		//Y B < C
				System.out.printf("%f,%f,%f",a,b,c);		//A B C
			} else {		//(C < B)
				if (a<c) {		// Y A < C
					System.out.printf("%f,%f,%f", a,c,b);		// A C B
				}	else {		// (C < A)
					System.out.printf("%f,%f,%f", c,a,b);		// C A B
				}
			}
		} else {		// (B < A)
			if (a<c) {		// Y A < C
				System.out.printf("%f,%f,%f",b,a,c);	// B A C
			} else {		// (C < A)
				if (b<c) {		// Y B < C
					System.out.printf("%f,%f,%f",b,c,a);		// B C A
				} else {		// ( C < B)
					System.out.printf("%f,%f,%f", c,b,a);		//B C A
				}
			}
		}
	}
}
