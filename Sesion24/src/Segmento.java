
public class Segmento {

	//CONSTRUCTORES
	
	/**
	 * Constructor Segmento default.
	 * Posici?n Punto 1 = (1.0,1.0)
	 * Posici?n Punto 2 = (-1.0,-1.0)
	 */
	public Segmento () {
		this(1.0,1.0,-1.0,-1.0);
	}
	
	/**
	 * 
	 * @param x Punto 1, posici?n x.
	 * @param y Punto 1, posici?n y.
	 * @param a Punto 2, posici?n x.
	 * @param b Punto 2, posici?n y.
	 */
	public Segmento (double x, double y, double a, double b) {
		puntoA = new Punto (x,y);
		puntoB = new Punto (a,b);
	}
	
	/**
	 * 
	 * @param x Punto 1, posici?n x.
	 * @param y Punto 1, posici?n y.
	 * @param a Punto 2, posici?n x.
	 */
	public Segmento (double x, double y, double a) {
		this (x,y,a,-1.0);
	}
	
	/**
	 * 
	 * @param x Punto 1, posici?n x.
	 * @param y Punto 1, posici?n y.
	 */
	public Segmento (double x, double y) {
		this (x,y,-1.0,-1.0);
	}
	
	/**
	 * 
	 * @param x Punto 1, posici?n x.
	 */
	public Segmento (double x) {
		this (x,1.0,-1.0,-1.0);
	}
	
	/**
	 * 
	 * @param s Segmento a copiar.
	 */
	public Segmento (Segmento s) {
		this (s.getAX(),s.getAY(),s.getBX(),s.getBY());
	}
	
	//ATRIBUTOS
	private Punto puntoA;
	private Punto puntoB;
	
	//M?TODOS SET/GET
	
	/**
	 * 
	 * @return Posici?n x del punto A.
	 */
	private double getAX() {
		return puntoA.getX();
	}
	
	/**
	 * 
	 * @return Posici?n y del punto A.
	 */
	private double getAY() {
		return puntoA.getY();
	}
	
	/**
	 * 
	 * @return Posici?n x del punto B.
	 */
	private double getBX() {
		return puntoB.getX();
	}
	
	/**
	 * 
	 * @return Posici?n y del punto B.
	 */
	private double getBY() {
		return puntoB.getY();
	}
	
	//M?todos de c?lculo.
	
	/**
	 * 
	 * @return Pendiente.
	 */
	public double calculaPendiente() {
		return (getBY()-getAY())/(getBX()-getAX());
	}
	
	/**
	 * 
	 * @param s Segmento de comparaci?n.
	 * @return Boolean. Paralelos o no.
	 */
	public boolean sonParalelos(Segmento s) {
		return calculaPendiente()==s.calculaPendiente();
	}
	
	/**
	 * 
	 * @param Objeto
	 * @return Boolean si son iguales o no.
	 */
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof Segmento) {
			Segmento s = (Segmento) obj;
			return ((this.getAX()==s.getAX() && this.getBX()==s.getBX() && this.getAY()==s.getAY() && this.getBY()==s.getBY()) ||
					(this.getAX()==s.getBX() && this.getBX()==s.getAX() && this.getAY()==s.getAY() && this.getBY()==s.getBY()) ||
					(this.getAX()==s.getAX() && this.getBX()==s.getBX() && this.getAY()==s.getBY() && this.getBY()==s.getAY()) ||
					(this.getAX()==s.getBX() && this.getBX()==s.getAX() && this.getAY()==s.getBY() && this.getBY()==s.getAY()));
		}
		else return false;
	}
	
	
}
