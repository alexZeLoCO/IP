import java.util.Scanner;		//IMPORT SCANNER
public class EcuaciónSegundoGrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.println("La ecuación es del tipo: ax^2+bx+c=0");		//GUÍA DE USUARIO
		System.out.print("Introduzca el valor de a: ");		//SOLICITA VALOR
		double a = teclado.nextDouble();		//ALMACENA VALOR EN A
		System.out.print("Introduzca el valor de b: ");		//SOLICITA VALOR
		double b = teclado.nextDouble();		//ALMACENA VALOR EN B
		System.out.print("Introduzca el valor de c: ");		//SOLICITA VALOR
		double c = teclado.nextDouble();		//ALMACENA VALOR EN C

		double sqrt = Math.pow(b,2)-4*a*c;
		if (sqrt<0) {		//SI CONTENIDO DE RAÍZ ES NEGATIVO
			System.out.print("La ecuación sólo tiene soluciones imaginarias");		//OUTPUT
		} else {
			double x1 = (-b + Math.sqrt(sqrt))/(2*a);		//RESULTADO 1
			
			if (sqrt!=0) {		//SI SQRT NO ES 0 (DOS RESULTADOS)
				double x2 = (-b - Math.sqrt(sqrt))/(2*a);		//RESULTADO 2
				System.out.printf("Las soluciones de la ecuación son: %f y %f",x1,x2);		//OUTPUT
			} else {		//SI NO: (UN RESULTADO)
				System.out.printf("La ecuación tiene una única solución: %f",x1);		//OUTPUT
			}
		}
	}
}