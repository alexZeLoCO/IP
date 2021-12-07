import java.util.Scanner;

/**
 * @author Alejandro Rodr�guez
 * El programa muestra los n�meros amigos de un intervalo.
 *
 */
public class NumerosAmigosDeUnIntervalo {
	
	public static int sumaDivisores (int a) {
		int suma = 0;		//SUMATORIO DE DIVISORES
		
		for (int i = 1; i==a/2; i++) {		//PARA N VECES
			if (a%i==0) {		//SI N1 ES DIVISIBLE ENTRE I
				suma = suma + i;		//AUMENTAR VALOR DE SUMA
			}
		}
		return suma;		//DEVOLVER SUMA
	}

	public static boolean sonAmigos (int a, int b) {
		return (sumaDivisores(a) == b && sumaDivisores(b) == a);		//CONDICI�N N�MEROS AMIGOS

	}
	
	public static void main(String[] args) {

		
		
		Scanner teclado = new Scanner (System.in);

		System.out.print("Introduzca el valor a del intervalo [a,b]: ");
		int a = teclado.nextInt();
		System.out.print("Introduzca el valor b del intervalo [a,b]: ");
		int b = teclado.nextInt();

		System.out.print("Introduzca un n�mero entero: ");
		int N = teclado.nextInt();
		
		int elemento = a;
		while (elemento<=b && !sonAmigos(N,elemento)) {
			elemento ++;
		}
		
		if (elemento<=b) {		
			System.out.printf("El valor %d es amigo de %d.",elemento,N);	
		} else {
			System.out.print("No hay valores amigos.");		
		}
		


}
}

