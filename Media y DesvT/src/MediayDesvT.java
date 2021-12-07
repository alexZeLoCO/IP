import java.util.Scanner;
public class MediayDesvT {
	public static void main (String[] args) {
		Scanner Teclado = new Scanner (System.in);
				
		System.out.print("Introduzca un número real: ");
		double N1 = Teclado.nextDouble();
		System.out.print("Introduzca un número real: ");
		double N2 = Teclado.nextDouble();
		System.out.print("Introduzca un número real: ");
		double N3 = Teclado.nextDouble();
		System.out.print("Introduzca un número real: ");
		double N4 = Teclado.nextDouble();
			
		double media = (double) (N1+N2+N3+N4)/4;
		double desv = (double) (Math.sqrt(media));
		System.out.printf ("La media de los números introducidos es %.2f, y la desviación es %.2f", media, desv);
		
		}
	}