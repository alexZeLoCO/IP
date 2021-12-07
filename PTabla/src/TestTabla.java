import java.util.Scanner;		//IMPORTAR SCANNER
public class TestTabla {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca un número entero: ");		//SOLICITAR VALOR
		int valor = teclado.nextInt();		//ALMACENAR VALOR
		for (int i = 1;i<=10;i++) {			//REPETIR 10 VECES
				//EMPEZANDO CON I = 1, TERMINANDO CON I = 10
			System.out.printf("%d·%d = %d\n",valor,i,(valor*i));		//OUTPUT
		}
	}

}
