import java.util.Scanner;		//IMPORTAR SCANNER
public class Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un año: ");		//SOLICITA DATO
		int año = teclado.nextInt();		//ALMACENAR VALOR EN AÑO
		
		if (año<=0) {		//VALIDACIÓN
			System.out.print("El año introducido no es válido, es menor que 0.");
			
		} else {
			//SI AÑO ES DIVISIBLE ENTRE 400 O DIVISIBLE ENTRE 4 PERO NO ENTRE 100
			if (año%400==0 || (año%4==0 && año%100!=0)) {
				System.out.print("El año introducido es bisiesto.");		//BISIESTO
			} else {		//SI NO
				System.out.print("El año introducido no es bisiesto.");		//NO BISIESTO
			}
		}
	}
}
