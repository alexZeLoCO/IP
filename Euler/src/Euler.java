import java.util.Scanner;		//IMPORTA SCANNER
public class Euler {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		double suma = 0;		//INICIALIZA SUMA
		System.out.print("Introduzca una n para aproximar el valor del número de Euler: ");		//SOLICITA VALOR
		double n=teclado.nextInt();		//ALMACENA VALOR EN N
		
		for (int i=0;i<=n;i++) {		//REPETIR N VECES
			double F=1;			//VARIABLE F FACTORIAL
			
			for (int a=1;a<=i;a++) {			//BUCLE FACTORIAL
				F=F*a;		//FACTORIAL ES FACTORIAL * A
			}
			
			suma = suma + ((double)1/F);		//SUMAR A SUMA
		}		
				//OUTPUT
		System.out.printf("El número se aproxima a: %f",suma);
	}

}
