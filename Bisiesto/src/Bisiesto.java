import java.util.Scanner;		//IMPORTAR SCANNER
public class Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un a�o: ");		//SOLICITA DATO
		int a�o = teclado.nextInt();		//ALMACENAR VALOR EN A�O
		
		if (a�o<=0) {		//VALIDACI�N
			System.out.print("El a�o introducido no es v�lido, es menor que 0.");
			
		} else {
			//SI A�O ES DIVISIBLE ENTRE 400 O DIVISIBLE ENTRE 4 PERO NO ENTRE 100
			if (a�o%400==0 || (a�o%4==0 && a�o%100!=0)) {
				System.out.print("El a�o introducido es bisiesto.");		//BISIESTO
			} else {		//SI NO
				System.out.print("El a�o introducido no es bisiesto.");		//NO BISIESTO
			}
		}
	}
}
