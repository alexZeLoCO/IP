import java.util.Scanner;

/** Lee dos números enteros de teclado y muestra su suma en la consola
 *  @author los profesores de IP  */
public class SumaDosNúmeros {
	
	public static void main(String[ ] args) {
		int número1; //Declaramos dos variables enteras
		int número2;
		//Objeto Scanner asociado con el teclado
		Scanner teclado= new Scanner(System.in);
		//Leemos ambos enteros
		System.out.print("Introduce dos números: ");
		número1=teclado.nextInt();
		número2=teclado.nextInt();
		//Calculamos su suma
		int suma=número1+número2;
		//Mostramos el resultado en la pantalla
		System.out.printf("Su suma es %d\n",suma);
	}
}
