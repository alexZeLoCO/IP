
public class Rect�ngulo {
	
//-------------INICIALIZACI�N VARIABLES--------------
	private int x;
	private int y;
	private int base;
	private int altura;
	
//---------------M�TODOS SET----------------
	public void setX (int n) {
		x = n;
	}
	public void setY (int n) {
		y = n;
	}
	public void setBase (int n) {
		if (n>0) {
			base = n;
		} else {
			System.out.print("La base es igual o inferior a cero.");
			System.exit(0);
		}
	}
	public void setAltura (int n) {
		if (n>0) {
			altura = n;
		} else {
			System.out.print("La altura es igual o inferior a cero.");
			System.exit(0);
		}
	}
		
//----------------M�TODOS GET-------------
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}
	public int getBase () {
		return base;
	}
	public int getAltura () {
		return altura;
	}
	
//--------------M�TODOS DE C�LCULO-------------
	public int calculaArea () {
		return (getBase()*getAltura());
	}
	public int calcularPer�metro () {
		return (2*getBase()+2*getAltura());
	}
}
