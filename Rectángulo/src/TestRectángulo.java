import java.util.Scanner;
public class TestRectángulo {

	public static void main(String[] args) {

//-------CREAR OBJETOS----------
		Scanner teclado = new Scanner (System.in);
		Rectángulo Napoleón = new Rectángulo();
		
//---------INPUT--------		
		System.out.print("Introduzca la base del rectángulo: ");
		Napoleón.setBase(teclado.nextInt());
		System.out.print("Introduzca la altura del rectángulo: ");
		Napoleón.setAltura(teclado.nextInt());
		System.out.print("Introduzca la posición x del rectángulo: ");
		Napoleón.setX(teclado.nextInt());
		System.out.print("Introduzca la posición y del rectángulo: ");
		Napoleón.setY(teclado.nextInt());
		
//---------OUTPUT----------
		System.out.printf("EL rectángulo tiene una base de %d.\n",Napoleón.getBase());
		System.out.printf("El rectángulo tiene una altura de %d.\n",Napoleón.getAltura());
		System.out.printf("El rectángulo está en la posición (%d,%d).\n",Napoleón.getX(),Napoleón.getY());
		System.out.printf("El rectángulo tiene un área de %d.\n",Napoleón.calculaArea());
		System.out.printf("El rectángulo tiene un perímetro de %d.",Napoleón.calcularPerímetro());
		
	}
}
