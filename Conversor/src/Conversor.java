import java.util.Scanner; //Importa utilidad Sanner

public class Conversor {
	public static void main (String [] Args) {
		
		Scanner Teclado = new Scanner (System.in); // Variable Teclado para almacenar numero introducido
		System.out.print("Introduzca las millas: "); // Imprimir solicitud para introducir cantidad de millas
		
		double Millas = Teclado.nextDouble (); // Leer cantidad de millas
		
		double Km = Millas / 0.621371; // Calcular equivalencia en Km
		
		System.out.printf ("%.3f Millas son equivalentes a %.3f Kilómetros.", Millas, Km); // Imprimir la cantidad en Km

	}
}
