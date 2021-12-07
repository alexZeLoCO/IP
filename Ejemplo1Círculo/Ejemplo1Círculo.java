import java.util.Scanner;

public class Ejemplo1Círculo {

	public static void main(String[ ] args) {
		
		//--------CREAR OBJETOS--------
		Círculo Curie = new Círculo();		 //CREAR CÍRCULO Curie
		Scanner teclado= new Scanner(System.in); 		//CREAR ESCÁNER
		
		//---------INPUT----------
	    System.out.print("Introduzca el radio: ");
	    Curie.setRadio(teclado.nextDouble()); 		//RADIO
	    System.out.print("Introduzca la coordenada x de la circunferencia: ");
	    Curie.setX(teclado.nextDouble()); 		//COORDENADA X
	    System.out.print("Introduzca la coordenada y de la circunferencia: ");
	    Curie.setY(teclado.nextDouble());		 //COORDENADA Y
	   
	    //----------OUTPUT--------
		System.out.printf("El Área es %.2f.",Curie.calculaÁrea()); 		//ÁREA
		System.out.println("");
				//POSICIÓN
		System.out.printf("La circunferencia de radio %.2f está localizada en (%.2f,%.2f).",Curie.getRadio(),Curie.getX(),Curie.getY());
		System.out.println("");
				//PERÍMETRO
		System.out.printf("El perímetro es %.2f.\n",Curie.calcularPerímetro());
		
//---------AÑADIDOS SESIÓN 8-----------
		
		//------CREAR OBJETO-------
		Círculo Montesquieu = new Círculo ();		//CREAR CÍRCULO Montesquieu
		
		//------------INPUT--------
		System.out.print("Introduzca el radio del círculo 2: ");
		Montesquieu.setRadio(teclado.nextDouble());
		System.out.print("Introduzca la coordenada x de la circunferencia 2: ");
		Montesquieu.setX(teclado.nextDouble());
		System.out.print("Introduzca la coordenada y de la circunferencia 2: ");
		Montesquieu.setY(teclado.nextDouble());
		
		//-----------OUTPUT----------
		System.out.printf("El centro del círculo 2 es (%f,%f).\n",Montesquieu.getX(),Montesquieu.getY());
		//System.out.println("El centro del círculo 2 se modificará por el del círculo 1");
		//Montesquieu.copiaCentro(Curie.getX(),Curie.getY());
		//System.out.printf("El nuevo centro del círculo 2 es (%f,%f).\n",Montesquieu.getX(), Montesquieu.getY());
		System.out.printf("El área del círculo 2 es de %f.\n",Montesquieu.calculaÁrea());
		System.out.printf("La diferencia entre ambas áreas es de %f.",Montesquieu.diferenciaÁreas(Curie.calculaÁrea()));
		System.out.println("El radio del círculo 2 se modificará por la diferencia entre ambos centros.");
		Montesquieu.ajustaRadio(Curie.getX(),Curie.getY());
		System.out.printf("El nuevo radio del círculo 2 es %f.\n", Montesquieu.getRadio());
	}
}
