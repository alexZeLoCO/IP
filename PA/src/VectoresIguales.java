public class VectoresIguales {

	public static boolean vecIguales(int[] a,int[] b) {
		if (a.length!=b.length) {		//LONGITUDES IGUALES
			return false;		//FALSO
		} else {		//SI NO
			int i=0;		//INICIALIZA I
			while (i<a.length && a[i]!=b[i]) {		//CONDICIÓN DE BÚSQUEDA
				i++;		//ACTUALIZA I 
			} 
			i--;		//RESTAR UNO A LA I 
			if (a[i]==b[i]) {		//CONDICIÓN DE BÚSQUEDA
				return false;		//OUTPUT
			} else {		// SI NO
				return true;		//OUTPUT
			}
		}
	}

	public static void main(String[] args) {
		int [] v = { 3,4,5,2,7};		//V1
		int [] w = { 3,4,5,2,7};		//V2
		int [] z = { 3,4,5,2};			//V3
		int [] t = { 3,5,4,2,7};		//V4
		
		//OUTPUT
		System.out.println(vecIguales(v,w));
		System.out.println(vecIguales(v,z));
		System.out.println(vecIguales(v,t));
		//OUTPUT
	}
}
