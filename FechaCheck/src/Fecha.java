
public class Fecha {

	//------------------------ INICIALIZACI�N VARIABLES -----------------------------
	private static short dia;
	private static short mes;
	private static short a�o;
	private static short dias_mes;


	//------------------------ M�TODOS GET -----------------------------
	public short getDia () {
		return dia;
	}
	public short getMes () {
		return mes;
	}
	public short getA�o () {
		return a�o;
	}
	public short getDias_Mes () {
		return dias_mes;
	}


	//---------------------------M�TODOS SET ------------------------
	public void setDia (short d) {		//d ES PROVISIONAL, PARA COMPROBAR SI D�A ES V�LIDO.
		if (getMes() == 2 && (d<=0 || d>getDias_Mes()) || d%2==0 && d>31 || d%2!=0 && d>30) {		//CONDICI�N: SI EL D�A ES FEBRERO (2) Y EL D�A ES < 0 O > AL M�X DE DIAS EN FEBRERO (28 O 29).
			System.out.println("El dia introducido no es v�lido.");
			System.exit(0);		// CIERRA PROGRAMA.
		} else {
			System.out.println("El d�a introducido es v�lido.");
			dia = d;		//D�A CORRECTO. INTRODUCIR EN VARIABLE PRIVADA D�A.
		}
	}

	public void setMes (short m) {		//m ES PROVISIONAL, PARA COMPROBAR SI MES ES V�LIDO.
		if (m>12 || m<=0) {		//CONDICI�N: SI EL MES ES < 0 O > 12.
			System.out.println("El mes introducido no es v�lido.");
			System.exit(0);		// CIERRA PROGRAMA.
		} else {
			System.out.println("El mes introducido es v�lido.");
			mes = m;		//MES CORRECTO. ALMACENAR EN VARIABLE PRIVADA MES.
		}
	}

	public void setA�o (short a) {		//a ES PROVISIONAL, PARA COMPROBAR SI A�O ES V�LIDO.
		if (a<0 || a>9999) {		//CONDICI�N: SI A�O ES < 0 O > 9999.
			System.out.println("El a�o introducido no es v�lido.");
			System.exit(0);		// CIERRA PROGRAMA.
		} else {
			System.out.println("El a�o introducido es v�lido.");
			a�o = a;		//A�O CORRECTO. ALMACENAR EN VARIABLE PRIVADA A�O.
			setDias_mes();		//LLAMADA M�TODO SETDIAS_MES().
		}
	}
	
	public void setDias_mes() {		//ALGORITMO PARA AVERIGUAR SI A�O INTRODUCIDO ES O NO BISIESTO.
		
		/*A�O BISIESTO: DIVISIBLE ENTRE 4: S� ==> 400 = BISIESTO.
		 * 				 DIVISIBLE ENTRE 10: NO ==> 1900 = NO BISIESTO.
		 * 				 DIVISIBLE ENTRE 400: S� ==> 800 = BISIESTO.
		 * 
		 *RESUMEN: S�LO LOS A�OS DIVISIBLES ENTRE 4 SON BISIESTOS, LOS QUE ACABAN EN 00 NO LO SON A MENOS QUE TAMBI�N SEAN DIVISIBLES ENTRE 400.
		 *NECESARIO DETERMINAR BISIESTO PARA CONCRETAR LOS D�AS DE FEBRERO.
		 */
		
		if (getA�o()%4 == 0 && getA�o()%100 != 0 || getA�o() % 400 == 0) {		//CONDICI�N EQUIVALENTE:
																										//if (((double)getA�o()/4 == (int)getA�o()/4) && ((double) getA�o()/100 != (int)getA�o()/100) || (((double) getA�o()/100 != (int)getA�o()/100) )&& ((double) getA�o()/400 == (int) getA�o()/400)) {
			dias_mes=29;
			System.out.println("El a�o introducido es bisiesto.");
			System.out.println("Febrero tiene 29 d�as.");
		} else {
			dias_mes=28;
			System.out.println("El a�o introducido no es bisiesto.");
			System.out.println("Febrero tiene 28 d�as.");
		} 
		
		
	/*
	 * ------------------ C�DIGO EQUIVALENTE AL M�TODO SETDIAS_MES() ----------------------
	 * 
	public void setDias_mes () {
		if ((double)getA�o()/4==(int)getA�o()/4) {
			if ((double)getA�o()/100==(int)getA�o()/100) {
				if ((double)getA�o()/400==(int)getA�o()/400) {
					dias_mes=29;
					System.out.println("El a�o introducido es bisiesto.");
					System.out.println("Febrero tiene 29 d�as.");
				} else {
					dias_mes=28;
					System.out.println("El a�o introducido no es bisiesto.");
					System.out.println("Febrero tiene 28 d�as.");
				}
			} else {
				dias_mes=29;
				System.out.println("El a�o introducido es bisiesto.");
				System.out.println("Febrero tiene 29 d�as.");
			}
		} else {
			dias_mes=28;
			System.out.println("El a�o introducido no es bisiesto.");
			System.out.println("Febrero tiene 28 d�as.");
		}

	 */
	}
}