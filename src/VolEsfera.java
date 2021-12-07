import java.util.Scanner;
public class VolEsfera {
	public static void main (String [] args) {
		double PI = 3.141592654;
		Scanner Teclado = new Scanner (System.in);
		System.out.print("Introduzca el radio de la esfera: ");
		double radio = Teclado.nextDouble();
		double Volumen = (4*PI*Math.pow(radio,3))/3;
		System.out.printf ("El volumen de la esfera de radio %.2f es %.2f.", radio, Volumen);
		}
}
