import java.util.Scanner;
public class Esfera {

	public static void main(String[] args) {
		
		double PI = 3.141592654;
		Scanner Teclado = new Scanner (System.in);
		System.out.print("Introduzca el radio de la esfera a calcular: ");
		double r = Teclado.nextDouble();
		
		if (r < 0) {
			System.out.printf("El radio introducido %.2f no es válido por ser inferior a 0.");
		} else {
			double radio = r;
			double Volumen = (4*PI*Math.pow(radio, 3)/3); 						//double v2 = (double) 4/3*PI*Math.pow(radio, 3);
			System.out.printf("El volumen de la esfera de radio %.2f es %.2f.", radio, Volumen);

		}
	}
}
