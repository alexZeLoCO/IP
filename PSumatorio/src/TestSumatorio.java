import java.util.Scanner;		//IMPORTAR SCANNER
public class TestSumatorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un número: ");		//SOLICITA VALOR 
		int a = teclado.nextInt();		//ALMACENA VALOR
		int i = 1;		//INICIALIZA I
		int suma = 0;		//INICIALIZA SUMA
		
		while (i<=a) {		//MIENTRAS I SEA MENOR/IGUAL A M
			suma = suma + i;		//ACTUALIZAR SUMA
			i++;		//ACTUALIZAR I
		}
				//OUTPUT
		System.out.printf("El sumatorio de todos los números hasta el %d, es %d.",a,suma);

	}

}
