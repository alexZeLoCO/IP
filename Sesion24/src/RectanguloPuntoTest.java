import java.util.Scanner;
public class RectanguloPuntoTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Rectangulo r1 = new Rectangulo ();
		Rectangulo r2 = new Rectangulo (1,1,2,4);
		Rectangulo r3 = new Rectangulo (r2);
		
		r1.imprimeRectangulo();
		r2.imprimeRectangulo();
		r3.imprimeRectangulo();
		
	}

}
