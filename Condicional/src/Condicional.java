import java.util.Scanner;		//IMPORTAR SCANNER
public class Condicional {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		
		System.out.print("Introduzca un valor: ");		//SOLICITA VALOR
		double x = teclado.nextDouble();		//ALMACENAR VALOR
		
		if (x < 0) {		// SI X ES NEGATIVO
			x = Math.abs(x);		//VALOR ABSOLUTO
			System.out.printf("El valor absoluto es: %f",x);	//OUTPUT	
		} else {
			if (x < 50) {		//SI X ES MENOR QUE 50
				x = x*3;		//TRIPLE
				System.out.printf("El triple es: %f",x);		//OUTPUT	
			} else {		//LOS DEMÁS (X MAYOR QUE 50)
				x = x*2;		//DOBLE
				System.out.printf("El doble es: %f",x);			//OUTPUT
			}
		}
	}
}