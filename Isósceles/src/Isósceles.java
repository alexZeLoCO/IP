
public class Is�sceles {

//---------INICIALIZACI�N DE VARIABLES-----------
	private int base;
	private int altura;
	
//------------M�TODOS SET-----------
	public void setBase(int x) {
		base = x;
	}
	public void setAltura (int x) {
		altura = x;
	}
	
//-----------M�TODOS GET------------
	public int getBase() {
		return base;
	}
	public int getAltura () {
		return altura;
	}
	
//------------M�TODOS DE C�LCULO----------
	public double calcula�rea() {
		return (getBase() * getAltura() / 2);
	}
	public double calculaPer�metro() {
		return ( getBase() + 2 * Math.sqrt((Math.pow(getBase() / 2, 2)+Math.pow(getAltura(), 2))));
	}
}
