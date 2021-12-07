import java.util.Scanner;		//INICIALIZAR SCANNER
public class ISBN2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca ISBN: ");		//SOLICITA DATO
		long ISBNT = teclado.nextLong();		//ALMACENA DATO EN ISBNT (TEMPORAL)
		long ISBN = ISBNT;		//PRESERVA ISBN INICIAL EN ISBN
		long suma=0;		//INICIALIZA SUMA
		for (int i = 10;i<=1;i--) {		//REPETIR 10 VECES
			long cifra = ISBNT%10;		//RECOGER CIFRA DE ISBNT
			suma = suma+i*cifra;		//SUMAR CIFRA MULTIPLICADA POR POSICIÓN (EQUIVALENTE A I)
			ISBNT = ISBNT/10;		//QUITAR CIFRA DE ISBNT
			
		}
		if (suma%11==0) {		//SI LA SUMA ES DIVISIBLE ENTRE 11
			System.out.printf("El ISBN: %d es válido.", ISBN);		//OUTPUT
		} else {		//SI NO
			System.out.printf("El ISBN: %d no es válido.",ISBN);		//OUTPUT
		}
	}

}
