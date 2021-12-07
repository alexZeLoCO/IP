import java.util.Scanner;		//IMPORTAR SCANNER
public class TestSumatorio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.println("En un intervalo del tipo: [a,b]");		//GUÍA USUARIO
		System.out.print("Defina a: ");		//SOLICITA VALOR A
		int a = teclado.nextInt();		//ALMACENA VALOR
		int i = a;		//PRESERVAR VALOR INICIAL PARA OUTPUT
		System.out.print("Defina b: ");		//SOLICITA VALOR B
		int b = teclado.nextInt();		//ALMACENA VALOR
		
		int suma = 0;		//INICIALIZA SUMA
		
		while (i<=b) {		//MIENTRAS A SEA MENOR/IGUAL A B
			suma = suma + i;		//ACTUALIZAR SUMA
			i++;		//ACTUALIZAR A
		}
				//OUTPUT
		System.out.printf("El sumatorio de todos los números del intervalo [%d,%d], es %d.",a,b,suma);

	}

}
