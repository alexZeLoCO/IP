
public class Fecha {

	//------------------------ INICIALIZACIÓN VARIABLES -----------------------------
	private static short dia;
	private static short mes;
	private static short año;
	private static short dias_mes;


	//------------------------ MÉTODOS GET -----------------------------
	public short getDia () {
		return dia;
	}
	public short getMes () {
		return mes;
	}
	public short getAño () {
		return año;
	}
	public short getDias_Mes () {
		return dias_mes;
	}


	//---------------------------MÉTODOS SET ------------------------
	public void setDia (short d) {		//d ES PROVISIONAL, PARA COMPROBAR SI DÍA ES VÁLIDO.
		if (getMes() == 2 && (d<=0 || d>getDias_Mes()) || d%2==0 && d>31 || d%2!=0 && d>30) {		//CONDICIÓN: SI EL DÍA ES FEBRERO (2) Y EL DÍA ES < 0 O > AL MÁX DE DIAS EN FEBRERO (28 O 29).
			System.out.println("El dia introducido no es válido.");
			System.exit(0);		// CIERRA PROGRAMA.
		} else {
			System.out.println("El día introducido es válido.");
			dia = d;		//DÍA CORRECTO. INTRODUCIR EN VARIABLE PRIVADA DÍA.
		}
	}

	public void setMes (short m) {		//m ES PROVISIONAL, PARA COMPROBAR SI MES ES VÁLIDO.
		if (m>12 || m<=0) {		//CONDICIÓN: SI EL MES ES < 0 O > 12.
			System.out.println("El mes introducido no es válido.");
			System.exit(0);		// CIERRA PROGRAMA.
		} else {
			System.out.println("El mes introducido es válido.");
			mes = m;		//MES CORRECTO. ALMACENAR EN VARIABLE PRIVADA MES.
		}
	}

	public void setAño (short a) {		//a ES PROVISIONAL, PARA COMPROBAR SI AÑO ES VÁLIDO.
		if (a<0 || a>9999) {		//CONDICIÓN: SI AÑO ES < 0 O > 9999.
			System.out.println("El año introducido no es válido.");
			System.exit(0);		// CIERRA PROGRAMA.
		} else {
			System.out.println("El año introducido es válido.");
			año = a;		//AÑO CORRECTO. ALMACENAR EN VARIABLE PRIVADA AÑO.
			setDias_mes();		//LLAMADA MÉTODO SETDIAS_MES().
		}
	}
	
	public void setDias_mes() {		//ALGORITMO PARA AVERIGUAR SI AÑO INTRODUCIDO ES O NO BISIESTO.
		
		/*AÑO BISIESTO: DIVISIBLE ENTRE 4: SÍ ==> 400 = BISIESTO.
		 * 				 DIVISIBLE ENTRE 10: NO ==> 1900 = NO BISIESTO.
		 * 				 DIVISIBLE ENTRE 400: SÍ ==> 800 = BISIESTO.
		 * 
		 *RESUMEN: SÓLO LOS AÑOS DIVISIBLES ENTRE 4 SON BISIESTOS, LOS QUE ACABAN EN 00 NO LO SON A MENOS QUE TAMBIÉN SEAN DIVISIBLES ENTRE 400.
		 *NECESARIO DETERMINAR BISIESTO PARA CONCRETAR LOS DÍAS DE FEBRERO.
		 */
		
		if (getAño()%4 == 0 && getAño()%100 != 0 || getAño() % 400 == 0) {		//CONDICIÓN EQUIVALENTE:
																										//if (((double)getAño()/4 == (int)getAño()/4) && ((double) getAño()/100 != (int)getAño()/100) || (((double) getAño()/100 != (int)getAño()/100) )&& ((double) getAño()/400 == (int) getAño()/400)) {
			dias_mes=29;
			System.out.println("El año introducido es bisiesto.");
			System.out.println("Febrero tiene 29 días.");
		} else {
			dias_mes=28;
			System.out.println("El año introducido no es bisiesto.");
			System.out.println("Febrero tiene 28 días.");
		} 
		
		
	/*
	 * ------------------ CÓDIGO EQUIVALENTE AL MÉTODO SETDIAS_MES() ----------------------
	 * 
	public void setDias_mes () {
		if ((double)getAño()/4==(int)getAño()/4) {
			if ((double)getAño()/100==(int)getAño()/100) {
				if ((double)getAño()/400==(int)getAño()/400) {
					dias_mes=29;
					System.out.println("El año introducido es bisiesto.");
					System.out.println("Febrero tiene 29 días.");
				} else {
					dias_mes=28;
					System.out.println("El año introducido no es bisiesto.");
					System.out.println("Febrero tiene 28 días.");
				}
			} else {
				dias_mes=29;
				System.out.println("El año introducido es bisiesto.");
				System.out.println("Febrero tiene 29 días.");
			}
		} else {
			dias_mes=28;
			System.out.println("El año introducido no es bisiesto.");
			System.out.println("Febrero tiene 28 días.");
		}

	 */
	}
}