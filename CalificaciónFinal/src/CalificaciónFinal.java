import java.util.Scanner;		//IMPORTAR SCANNER
public class CalificaciónFinal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca una nota: ");		//SOLICITA VALOR
		double t = teclado.nextDouble();		//ALMACENA VALOR EN T
		System.out.print("Introduzca una nota: ");		//SOLICITA VALOR
		double p = teclado.nextDouble();		//ALMACENA VALOR EN P

		if (t>=9 && p>=9) {		//SI AMBOS IGUAL MAYOR A 9
			System.out.print("Sobresaliente");		//SOBRESALIENTE
		} else {		
			if (t>=7.5 && p>=7.5 && (t<9 || p<9)) {		//SI AMBOS MAYORES IGUALES A 7.5 Y UNO MENOR QUE 9
				System.out.print("Notable");		//NOTABLE
			} else {
				if (t>=5 && p>=5 && (t<7.5 || p<7.5)) {		//SI AMBOS MAYORES IGUALES A 5 Y UNO MENOR QUE 7.5
					System.out.print("Suficiente");		//SUFICIENTE
				} else {		//DESCARTE (UNO O DOS DE ELLOS MENOR A 5)
					System.out.print("Insuficiente");		//INSUFICIENTE
				}
			}
		}
	}
}