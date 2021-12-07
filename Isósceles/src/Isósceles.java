
public class Isósceles {

//---------INICIALIZACIÓN DE VARIABLES-----------
	private int base;
	private int altura;
	
//------------MÉTODOS SET-----------
	public void setBase(int x) {
		base = x;
	}
	public void setAltura (int x) {
		altura = x;
	}
	
//-----------MÉTODOS GET------------
	public int getBase() {
		return base;
	}
	public int getAltura () {
		return altura;
	}
	
//------------MÉTODOS DE CÁLCULO----------
	public double calculaÁrea() {
		return (getBase() * getAltura() / 2);
	}
	public double calculaPerímetro() {
		return ( getBase() + 2 * Math.sqrt((Math.pow(getBase() / 2, 2)+Math.pow(getAltura(), 2))));
	}
}
