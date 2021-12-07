public class Círculo {
	
//------INICIALIZACIÓN VARIABLES-----------
	private double X;
	private double Y;
	private double radio;
	private static final double PI=3.1416;
	
	
//---------------------MÉTODOS GET-----------------------------
	public double getRadio() {
		return radio;		 //DEVUELVE RADIO
	}
	public double getX() {
		return X;		 //DEVUELVE POS X
	}
	public double getY() {
		return Y;		 //DEVUELVE POS Y
	}
	
	
//---------------------MÉTODOS SET------------------------------
	public void setRadio(double r) {
			radio=r; 		//INTRODUCE VARIABLE RADIO
	}
	public void setX (double x) {
		X = x; 		//INTRODUCE VARIABLE X
	}
	public void setY (double y) {
		Y = y; 		//INTRODUCE VARIABLE Y
	}
	
	
//--------------------MÉTODOS CÁLCULO-------------------------
	public double calculaÁrea() {
		return PI*radio*radio; 		//DEVUELVE AREA
	}
	public double calcularPerímetro() {
		return PI*radio*2;		//DEVUELVE PERÍMETRO
	}

	
//-------------MÉTODOS NUEVOS SESIÓN 8-------------
	//TAREA 1
	public void copiaCentro(double A, double B) {
		setX(A);
		setY(B);
	}
	//TAREA 2
	public double diferenciaÁreas(double A) {
		return (Math.abs(calculaÁrea()-A));		//VALOR ABSOLUTO MATH.(ABS) PARA VALOR POSITIVO
	}
	//TAREA 3
	public void ajustaRadio(double A, double B) {		
		setRadio(Math.sqrt( (Math.pow (A-getX(),2) - Math.pow(B-getY(),2))));
	}		//EL MÉTODO ANULA EL MÉTODO COPIACENTRO - SI AMBOS CENTROS SON IGUALES, LA DIFERENCIA ES 0 ==> RADIO = 0
}
