import java.util.Scanner;
public class TestIs�sceles {

	public static void main(String[] args) {
		
//---------CREA OBJETOS----------
		Scanner teclado = new Scanner (System.in);
		Is�sceles Col�n = new Is�sceles ();
		
//------------INPUT----------
		System.out.print("Introduzca la base del tri�ngulo: ");
		Col�n.setBase(teclado.nextInt());
		System.out.print("Introduzca la altura del tri�ngulo: ");
		Col�n.setAltura(teclado.nextInt());
		
//------------OUTPUT------------
		System.out.printf("El �rea del tri�ngulo es %f.\n",Col�n.calcula�rea());
		System.out.printf("El per�metro del tri�ngulo es %f.\n", Col�n.calculaPer�metro());
		
	}
}
