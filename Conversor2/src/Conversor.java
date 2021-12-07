import java.util.Scanner;		//IMPORTAR SCANNER
public class Conversor {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.println("1. Milla-Km | 2. Km-Yarda | 3. Libra-Kg");		//GU�A USUARIO
		System.out.print("Introduzca su selecci�n (1 2 3): ");		//SOLICITA VALOR
		byte x = teclado.nextByte();		//ALMACENA VALOR EN X
		
		if (x<0 || x>3) {		//VALIDACI�N
			System.out.print("El valor introducido no es v�lido.");
			
		}	else {		//VALIDADO
			
			if (x==1) {		//SELECCI�N 1 (MILLA-KM)
				System.out.println("Se ha elegido conversi�n 1. Milla-Km.");		//AVISO
				System.out.print("Introduzca las Millas: ");		//SOLICITA VALOR
				double M = teclado.nextDouble();		//ALMACENA VALOR EN M
				System.out.printf("Las millas introducidas son equivalentes a %f Km",M*1.60934);		//OUTPUT
			
			} else {
				
				if (x==2) {		//SELECCI�N 2 (KM-YARDA)
					System.out.println("Se ha elegido conversi�n 2. Km-Yarda.");		//AVISO
					System.out.print("Introduzca los Km: ");		//SOLICITA VALOR
					double Km = teclado.nextDouble();		//ALMACENA VALOR EN KM
					System.out.printf("Los kil�metros introducidos son equivalentes a %f yardas.",Km*0.621371);		//OUTPUT
				
				} else {		//DESCARTE (3 LIBRA-KG)
					
					System.out.println("Se ha elegido conversi�n 3. Libra-Kg.");		//AVISO
					System.out.print("Introduzca las libras: ");		//SOLICITA VALOR
					double L = teclado.nextDouble();		//ALMACENA VALOR EN L
					System.out.printf("Las libras introducidas son equivalentes a %f Kg.",L*0.453592);		//OUTPUT
				}
			}
		}
	}
}
