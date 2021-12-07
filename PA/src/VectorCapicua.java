
public class VectorCapicua {
	public static boolean vectorCapic�a(int[] v) {
		int i=0;		//INICIALIZA I 
		while (i<=v.length/2-1 && v[i]==v[v.length-i-1]) {		//CONDICIONES
			i++;		//ACTUALIZA I
		}
		if (v[i]!=v[v.length-i-1]) {		//SI SE INCUMPLE LA CONDICI�N DE B�SQUEDA
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
		System.out.printf("Vector v1 capic�a %b.\n",vectorCapic�a(v1));
		System.out.printf("Vector v2 capic�a %b.\n",vectorCapic�a(v2));
		System.out.printf("Vector v3 capic�a %b.\n",vectorCapic�a(v3));
		System.out.printf("Vector v4 capic�a %b.\n",vectorCapic�a(v4));
		//OUTPUT
	}

}
