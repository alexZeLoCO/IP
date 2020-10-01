
public class Date {

	private static short dia;
	private static short mes;
	private static short año;
	private static short dias_mes;


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



	public void setDia (short d) {
		if (getMes() == 2 && (d<=0 || d>getDias_Mes())) {
			System.out.println("El dia introducido no es válido.");
			System.exit(0);
		} else {
			System.out.println("El día introducido es válido.");
			dia = d;
		}
	}

public void setMes (short m) {
	if (m>12 || m<=0) {
		System.out.println("El mes introducido no es válido.");
		System.exit(0);
	} else {
		System.out.println("El mes introducido es válido.");
		mes = m;
	}
}

public void setAño (short a) {
	if (a<0 || a>9999) {
		System.out.println("El año introducido no es válido.");
		System.exit(0);
	} else {
		System.out.println("El año introducido es válido.");
		año = a;
	}
	setDias_mes();
}

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
	
	// ERROR
	
	/* if (((double)getAño()/4 == (int)getAño()/4) && (((double) getAño()/100 != (int)getAño()/100) && ((double) getAño()/400 == (int) getAño()/400))) {
		dias_mes=29;
		System.out.println("El año introducido es bisiesto.");
		System.out.println("Febrero tiene 29 días.");
	} else {
		dias_mes=28;
		System.out.println("El año introducido no es bisiesto.");
		System.out.println("Febrero tiene 28 días.");
	} */
	
	//ERROR
}
}