
public class VectorCapicua {
	public static boolean vectorCapicúa(int[] v) {
		int i=0;		//INICIALIZA I 
		while (i<=v.length/2-1 && v[i]==v[v.length-i-1]) {		//CONDICIONES
			i++;		//ACTUALIZA I
		}
		if (v[i]!=v[v.length-i-1]) {		//SI SE INCUMPLE LA CONDICIÓN DE BÚSQUEDA
			return false;		//OUTPUT
		} else {		//SI NO
			return true;		//OUTPUT
		}
	}
	public static void main(String[] args) {
		int []v1 = {1,2,3,4};		//V1
		int []v2 = {1,2,3,2,1};		//V2
		int []v3 = {10,20,20,10};	//V3
		int []v4 = {-7};			//V4
		
		//OUTPUT
		System.out.printf("Vector v1 capicúa %b.\n",vectorCapicúa(v1));
		System.out.printf("Vector v2 capicúa %b.\n",vectorCapicúa(v2));
		System.out.printf("Vector v3 capicúa %b.\n",vectorCapicúa(v3));
		System.out.printf("Vector v4 capicúa %b.\n",vectorCapicúa(v4));
		//OUTPUT
	}

}
