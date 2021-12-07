import java.util.Scanner;
public class TestIsósceles {

	public static void main(String[] args) {
		
//---------CREA OBJETOS----------
		Scanner teclado = new Scanner (System.in);
		Isósceles Colón = new Isósceles ();
		
//------------INPUT----------
		System.out.print("Introduzca la base del triángulo: ");
		Colón.setBase(teclado.nextInt());
		System.out.print("Introduzca la altura del triángulo: ");
		Colón.setAltura(teclado.nextInt());
		
//------------OUTPUT------------
		System.out.printf("El área del triángulo es %f.\n",Colón.calculaÁrea());
		System.out.printf("El perímetro del triángulo es %f.\n", Colón.calculaPerímetro());
		
	}
}
