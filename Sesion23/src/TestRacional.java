import java.util.Scanner;
public class TestRacional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Racional r1 = new Racional (2,3);
		Racional r2 = new Racional (3,7);
		Racional r3 = r1.suma(r2);
		Racional r4 = r1.resta(r2);
		Racional r5 = r1.multiplicación(r2);
		Racional r6 = r1.división(r2);
		r3.imprimeRacional();
		System.out.println();
		r4.imprimeRacional();
		System.out.println();
		r5.imprimeRacional();
		System.out.println();
		r6.imprimeRacional();
		
		Racional [] vector = new Racional [5];
		for (int i=0;i<vector.length;i++) {
			System.out.print("Introduzca numerador y denominador separados por un espacio: ");
			vector [i]=new Racional (teclado.nextInt(),teclado.nextInt());
		}
		Racional r7=new Racional();
		for (int i=0;i<vector.length;i++) {
			r7=r7.suma(vector[i]);
		}
		r7.imprimeRacional();
	}

}
