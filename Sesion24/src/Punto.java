/** Representa objetos Punto en un espacio de dos dimensiones
 *  @author los profesores de IP
 *  @version 1.0  */

public class Punto {
    
//------------------NUEVAS MODIFICACIONES-----------------------
	/* Constructores.*/
	public Punto () {		//SIN PAR?METROS
		this(1.0,1.0);
	}
	public Punto (double x, double y) {		//DOS POSICIONES
		setX(x);		//POS X = X
		setY(y);		//POS Y = Y
	}
	public Punto(Punto p) {			//OTRO PUNTO
		this(p.getX(),p.getY());
	}
	
	/* EQUALS Y TOSTRING */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof Punto) {
			Punto punto = (Punto) obj;
			return (this.getX()==punto.getX() && this.getY()==punto.getX());
		}
		else return false;
	}
	
//--------------------FIN DE LAS MODIFICACIONES------------------
	
	//Atributos
	/** Representa la coordenada X del punto */
	private double x;
	/** Representa la coordenada Y del punto */
	private double y;
	
	
	//Métodos públicos
	/** Devuelve el valor de la coordenada x del Punto
	 * @return el valor de x  */
	public double getX() {
		return x;
	}
	
	/** Cambia el valor de la coordenada x del Punto
	 * @param v nuevo valor para la coordenada x   */
	public void setX(double v) {
		x = v;
	}
	
	/** Devuelve el valor de la coordenada y del Punto
	 * @return el valor de y  */
	public double getY() {
		return y;
	}
	
	/** Cambia el valor de la coordenada y del Punto
	 * @param v nuevo valor para la coordenada y   */
	public void setY(double v) {
		y = v;
	}	
	
	/**Imprime un punto en la consola
	 * @return nada */ 
	public void imprimePunto() {
		System.out.printf("(%.2f,%.2f)\n",getX(),getY());
	}
	
}
