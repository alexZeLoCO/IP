import java.util.Scanner;
public class PaulSipple {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca la temperatura del aire: ");
		double T = teclado.nextDouble();
		System.out.print("Introduzca la velocidad del viento: ");
		double V = teclado.nextDouble();
		double Ts = 13.12 +0.6215*T -11.37*Math.pow(V,0.16)+0.3965*T*Math.pow(V, 0.16);
		System.out.printf("La temperatura de sensación es de %.3fCº.", Ts);
	}
}
