
public class Racional {

	private int num;
	private int den;

//---CONSTRUCTORES---
	public Racional() {
		this(0,1);
	}
	
	public Racional(int a) {
		this(a,1);
	}

	public Racional (int a, int b) {
		setNum(a);
		setDen(b);
	}
	
	public Racional (Racional a) {
		this (a.getNum(),a.getDen());
	}
	
//---SET---
	public void setDen (int a) {
		if (a!=0) {
			den=a;
		}
	}
	
	public void setNum (int a) {
		num=a;
	}
	
//---GET---
	public int getNum () {
		return num;
	}
	
	public int getDen () {
		return den;
	}
	
//---OPERACIONES---
	public void imprimeRacional() {
		System.out.println(getNum());
		System.out.println("---");
		System.out.println(getDen());
	}
	
	public Racional suma (Racional n) {
		return new Racional (getNum()*n.getDen()+n.getNum()*getDen(),getDen()*n.getDen());
	}
	
	public Racional resta (Racional n) {
		return new Racional (getNum()*n.getDen()-n.getNum()*getDen(),getDen()*n.getDen());
	}
	
	public Racional multiplicación (Racional n) {
		return new Racional (getNum()*n.getNum(),getDen()*n.getDen());
	}
	
	public Racional división (Racional n) {
		return new Racional (getNum()*n.getDen(),n.getNum()*getDen());
	}
	
	

}

