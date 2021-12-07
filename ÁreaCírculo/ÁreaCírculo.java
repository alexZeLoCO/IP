import java.util.Scanner;

/** Lee de teclado el radio de un círculo y muestra su área en la consola
 *  @author los profesores de IP  */
public class ÁreaCírculo {
	
	public static void main(String[ ] args) {
		final double PI=3.1416;  //Constante para pi
		double radio;            //variable para el radio 
		//Objeto Scanner asociado con el teclado
		Scanner teclado= new Scanner(System.in);
		//Leemos el radio
		System.out.print("Introduce el radio: ");
		radio=teclado.nextDouble();
		double área;
		área=radio*radio*PI;
		//Mostramos el área en la pantalla
		System.out.printf("El área es %f\n",área);
	}
}

