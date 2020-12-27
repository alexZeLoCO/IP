import java.util.Scanner;
public class SegmentoTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Segmento s1 = new Segmento();
		Segmento s2 = new Segmento(5.0,5.0,-2.2,-2.2);
		Segmento s3 = new Segmento(s2);
		
		System.out.printf("La pendiente del segmento 2 es: %.3f.\n",s2.calculaPendiente());
		System.out.printf("El segmento 1 y 2 son paralelos: %b.\n",s1.sonParalelos(s2));
		System.out.printf("Los segmentos 2 y 3 son paralelos: %b.\n", s2.sonParalelos(s3));
		
		Segmento s4 = new Segmento (2.0,3.0,1.0,2.0);
		Segmento s5 = new Segmento (1.0,2.0,3.0,4.0);
		Segmento s6 = new Segmento (2.0,3.0,1.0,2.0);
		Segmento s7 = new Segmento (1.0,2.0,2.0,3.0);
		Segmento s8 = new Segmento (1.0,1.0,3.0,2.0);
		
		System.out.printf("S4 y S5: %B\n",s4.equals(s5));
		System.out.printf("S4 y S6: %B\n",s4.equals(s6));
		System.out.printf("S4 y S7: %B\n",s4.equals(s7));
		System.out.printf("S4 y S8: %B\n",s4.equals(s8));
	}

}
