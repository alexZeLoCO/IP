import java.util.Scanner;
public class TestRect�ngulo {

	public static void main(String[] args) {

//-------CREAR OBJETOS----------
		Scanner teclado = new Scanner (System.in);
		Rect�ngulo Napole�n = new Rect�ngulo();
		
//---------INPUT--------		
		System.out.print("Introduzca la base del rect�ngulo: ");
		Napole�n.setBase(teclado.nextInt());
		System.out.print("Introduzca la altura del rect�ngulo: ");
		Napole�n.setAltura(teclado.nextInt());
		System.out.print("Introduzca la posici�n x del rect�ngulo: ");
		Napole�n.setX(teclado.nextInt());
		System.out.print("Introduzca la posici�n y del rect�ngulo: ");
		Napole�n.setY(teclado.nextInt());
		
//---------OUTPUT----------
		System.out.printf("EL rect�ngulo tiene una base de %d.\n",Napole�n.getBase());
		System.out.printf("El rect�ngulo tiene una altura de %d.\n",Napole�n.getAltura());
		System.out.printf("El rect�ngulo est� en la posici�n (%d,%d).\n",Napole�n.getX(),Napole�n.getY());
		System.out.printf("El rect�ngulo tiene un �rea de %d.\n",Napole�n.calculaArea());
		System.out.printf("El rect�ngulo tiene un per�metro de %d.",Napole�n.calcularPer�metro());
		
	}
}
