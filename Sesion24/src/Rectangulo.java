/** Representa objetos RectÃ¡ngulo
 *  @author los profesores de IP
 *  @version 1.0  */

public class Rectangulo {

	//CONSTRUCTORES
	public Rectangulo() {
		this(1.0,1.0,1.0,1.0);
	}
	
	public Rectangulo (double x, double y, double h, double b) {
		punto = new Punto(x,y);

		setAltura(h);
		setBase(b);
	}
	
	public Rectangulo (Rectangulo R) {
		this(R.getX(),R.getY(),R.getAltura(),R.getBase());
	}

    //Atributos
    /** REPRESENTA EL PUNTO CON UN OBJETO PUNTO */
    private Punto punto;
    /** Representa la base del RectÃ¡ngulo */
    private double base;
    /** Representa la altura del RectÃ¡ngulo */
    private double altura;
 
    //MÃ©todos pÃºblicos
    
    /**
     * Imprime los atributos del rect�ngulo.
     */
    public void imprimeRectangulo () {
    	System.out.printf("Posici�n: (%.2f,%.2f)",getX(),getY());
    	System.out.printf("Tama�o (Base, altura): %.2f %.2f.\n",getBase(), getAltura());
    }
  
    /** Devuelve el valor de la coordenada x del RectÃ¡ngulo
     * @return el valor de x  */
    public double getX() {
        return punto.getX();
    }

    /** Cambia el valor de la coordenada x del RectÃ¡ngulo
     * @param x nuevo valor para la coordenada x   */
	public void setX(double v) {
        punto.setX(v);
    }

     /** Devuelve el valor de la coordenada y del RectÃ¡ngulo
      * @return el valor de y  */
	public double getY() {
       return punto.getY();
    }

    /** Cambia el valor de la coordenada y del RectÃ¡ngulo
      * @param y nuevo valor para la coordenada y   */
    public void setY(double v) {
        punto.setY(v);
    }	

    /** Devuelve el valor de la base del RectÃ¡ngulo
     * @return el valor de base  */
    public double getBase() {
        return base;
    }

    /** Cambia el valor de la base del RectÃ¡ngulo
     * @param v nuevo valor para la base   */
    public void setBase(double v) {
        if (v > 0 ) base = v;
    }	

    /** Devuelve el valor de la altura del RectÃ¡ngulo
      * @return el valor de altura  */
	public double getAltura() {
       return altura;
    }

	/** Cambia el valor de la altura del RectÃ¡ngulo
     * @param v nuevo valor para la altura   */
    public void setAltura(double v) {
        if (v > 0 ) altura = v;
    }		

    /**Calcula el Ã¡rea del RectÃ¡ngulo
     * @return el Ã¡rea */ 
    public double calculaArea() {
        return getBase()*getAltura();
    }

    /**Calcula el perÃ­metro del RectÃ¡ngulo
     * @return el perÃ­metro */ 
    public double calculaPerÃ­metro() {
        return getBase()*2+getAltura()*2;
	}
    
    
}

