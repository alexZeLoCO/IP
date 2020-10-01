import java.util.Scanner;
public class Fecha {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner (System.in);
		Date Fecha = new Date ();
		System.out.print("Introduzca el año: ");
		Fecha.setAño(Teclado.nextShort());
		System.out.print("Introduzca el mes: ");
		Fecha.setMes(Teclado.nextShort());
		System.out.print("Introduzca el día: ");
		Fecha.setDia(Teclado.nextShort());
		
		
		System.out.printf("La fecha introducida es %d/%d/%d.", Fecha.getDia(),Fecha.getMes(),Fecha.getAño());
		
	}

}
