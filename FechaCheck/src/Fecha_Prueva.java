import java.util.Scanner;		//IMPORTAR FUNCIÓN SCANNER PARA TECLADO.
public class Fecha_Prueva {

	public static void main (String [] args)  {
		
		Scanner Teclado = new Scanner (System.in);		//CREA OBJETO TIPO SCANNER, NOMBRE TECLADO.
		Fecha Fecha = new Fecha ();		//CREA OBJETO TIPO FECHA, NOMBRE FECHA.
		
		System.out.print("Introduzca el año: ");		//SOLICITA AÑO.
		Fecha.setAño(Teclado.nextShort());		//LLAMADA MÉTODO SETAÑO() DE OBJETO FECHA.
		System.out.print("Introduzca el mes: ");		//SOLICITA MES.
		Fecha.setMes(Teclado.nextShort());		//LLAMADA MÉTODO SETMES() DE OBJETO FECHA.
		System.out.print("Introduzca el día: ");		//SOLICITA DÍA.
		Fecha.setDia(Teclado.nextShort());		//LLAMADA MÉTODO SETDIA() DE OBJTO FECHA.
		
		
		System.out.printf("La fecha introducida es %d/%d/%d.", Fecha.getDia(),Fecha.getMes(),Fecha.getAño());
		
	}

}