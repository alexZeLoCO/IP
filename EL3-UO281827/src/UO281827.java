import java.util.Scanner;
public class UO281827 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);			//CREA TECLADO

//---EJERCICIO 1---
		System.out.print("Introduzca longitud del vector: ");		//SOLICITA VALOR
		int [] vector = new int [teclado.nextInt()];			//CREA VECTOR
		System.out.print("Introduzca elementos del vector: ");			//SOLICITA ELEMENTOS
		for (int i=0; i<vector.length;i++) {			//PARA CADA ELEMENTO
			vector[i]=teclado.nextInt();			//RELLENAR VECTOR
		}
		
//---EJERCICIO 2---
		int suma=0;			//INICIALIZA SUMA
		for (int i=0;i<vector.length;i++) {			//PARA CADA ELEMENTO DEL VECTOR
			if (i%2==0 && (2<=vector[i] && vector[i]<=4)) {			//SI ES POSICIÓN PAR Y ESTÁ EN [2,4]
				suma=suma+vector[i];			//ACTUALIZAR SUMA
			}
		}
					//OUTPUT
		System.out.printf("La suma de las posiciones pares cuyo valor está en el intervalo [2,4] es: %d.\n",suma);
	
//--EJERCICIO 3---
		int i=-1;			//INICIALIZAR I
		do {			//BUCLE
			i++;			//ACTUALIZAR I
		} while (i<vector.length-1 && vector[i]!=vector[i+1]*2);			//HASTA EL ELEMENTO PENÚLTIMO O QUE SE ENCUENTRE UN VALOR QUE CUMPLA
		if (i==vector.length-1) {			//SI SE LLEGÓ AL PENÚLTIMO
			System.out.print("NO, ningún elemento es el doble que el siguiente.\n");			//OUTPUT
		} else {		//SI NO -SE ENCONTRÓ UN VALOR QUE CUMPLE CONDICIONES-
			System.out.printf("Sí, en la posición: %d.\n",i);				//OUTPUT
		}
		
//---EJERCICIO 4---
		System.out.print("Introduzca una palabra: ");			//SOLICITA VALOR
		String palabra = teclado.next();			//CREA STRING Y RELLENA
		
//---EJERCICIO 5---
		for (i=0;i<palabra.length();i++) {					//PARA CADA ELEMENTO DEL STRING
			System.out.println(palabra.charAt(i));			//IMPRIMR LETRA Y SALTO DE LÍNEA
		}
	}

}
