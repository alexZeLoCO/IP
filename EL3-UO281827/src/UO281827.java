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
			if (i%2==0 && (2<=vector[i] && vector[i]<=4)) {			//SI ES POSICI�N PAR Y EST� EN [2,4]
				suma=suma+vector[i];			//ACTUALIZAR SUMA
			}
		}
					//OUTPUT
		System.out.printf("La suma de las posiciones pares cuyo valor est� en el intervalo [2,4] es: %d.\n",suma);
	
//--EJERCICIO 3---
		int i=-1;			//INICIALIZAR I
		do {			//BUCLE
			i++;			//ACTUALIZAR I
		} while (i<vector.length-1 && vector[i]!=vector[i+1]*2);			//HASTA EL ELEMENTO PEN�LTIMO O QUE SE ENCUENTRE UN VALOR QUE CUMPLA
		if (i==vector.length-1) {			//SI SE LLEG� AL PEN�LTIMO
			System.out.print("NO, ning�n elemento es el doble que el siguiente.\n");			//OUTPUT
		} else {		//SI NO -SE ENCONTR� UN VALOR QUE CUMPLE CONDICIONES-
			System.out.printf("S�, en la posici�n: %d.\n",i);				//OUTPUT
		}
		
//---EJERCICIO 4---
		System.out.print("Introduzca una palabra: ");			//SOLICITA VALOR
		String palabra = teclado.next();			//CREA STRING Y RELLENA
		
//---EJERCICIO 5---
		for (i=0;i<palabra.length();i++) {					//PARA CADA ELEMENTO DEL STRING
			System.out.println(palabra.charAt(i));			//IMPRIMR LETRA Y SALTO DE L�NEA
		}
	}

}
