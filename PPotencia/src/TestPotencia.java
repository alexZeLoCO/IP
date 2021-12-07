import java.util.Scanner;		//SCANNER
public class TestPotencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca la base: ");		//SOLICITA VALOR
		int base = teclado.nextInt();		//ALMACENA VALOR EN BASE
		System.out.print("Introduzca el exponente: ");		//SOLICITA VALOR
		int exponente = teclado.nextInt();		//ALMACENA VALOR EN EXPONENTE
				//OUTPUT
		System.out.printf("El resultado de la potencia de base %d y exponente %d es: %d.",base,exponente,(int)(Math.pow(base, exponente)));
																											//DEVOLVER UN INT
	}

}
