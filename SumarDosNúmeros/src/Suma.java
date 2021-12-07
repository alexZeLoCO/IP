import java.util.Scanner;			 //Importar escáner

public class Suma {
	public static void main (String [] Args) {
		
		System.out.println ("Este programa solicitará dos números reales de máximo 2 decimales y los sumára."); 			//Introducción
		System.out.println (""); 			//Espaciado
		System.out.println (""); 			//Espaciado
		double N1; 			//Iniciación de variable 1
		double N2; 			//Iniciación de variable 2
		
		Scanner Teclado = new Scanner (System.in); 			//Iniciación variable Teclado
		
		System.out.print ("Introduzca el primer número real: "); 			//Solicita primer número
		N1 = Teclado.nextDouble();			 //Introduce número en N1
		System.out.println ("");			 //Espaciado
		System.out.print ("Introduzca el segundo número real: "); 			//Solicita segundo número
		N2 = Teclado.nextDouble();			 //Introduce número en N2
		System.out.println ("");			 //Espaciado
		
		double N=N1+N2; 			//Iniciación variable N e introducción de la suma N1 + N2 en N
		System.out.printf("La suma de %.2f y %.2f es igual a %.2f", N1,N2,N);			 //Impresión del resultado N
	}
}