import java.util.Scanner;		//IMPORTAR FUNCI�N SCANNER PARA TECLADO.
public class Fecha_Prueva {

	public static void main (String [] args)  {
		
		Scanner Teclado = new Scanner (System.in);		//CREA OBJETO TIPO SCANNER, NOMBRE TECLADO.
		Fecha Fecha = new Fecha ();		//CREA OBJETO TIPO FECHA, NOMBRE FECHA.
		
		System.out.print("Introduzca el a�o: ");		//SOLICITA A�O.
		Fecha.setA�o(Teclado.nextShort());		//LLAMADA M�TODO SETA�O() DE OBJETO FECHA.
		System.out.print("Introduzca el mes: ");		//SOLICITA MES.
		Fecha.setMes(Teclado.nextShort());		//LLAMADA M�TODO SETMES() DE OBJETO FECHA.
		System.out.print("Introduzca el d�a: ");		//SOLICITA D�A.
		Fecha.setDia(Teclado.nextShort());		//LLAMADA M�TODO SETDIA() DE OBJTO FECHA.
		
		
		System.out.printf("La fecha introducida es %d/%d/%d.", Fecha.getDia(),Fecha.getMes(),Fecha.getA�o());
		
	}

}