
public class PrecedenciaAsociatividad {
	public static void main(String [] args) {
		double x = 2.0, y = 5.0;
		double sol1 = (double) x+y/3-4*2*5/x-3;
		System.out.println(sol1);
		System.out.println("------------------------------");
		double sol2 = (double) x*y+ 2*x/3*5 + 4/x-1;
		System.out.println(sol2);
		System.out.println("------------------------------");
		double sol3 = (double) (x+y)/3 - 4 * ((2*5)/x-3);
		System.out.println(sol3);
		System.out.println("------------------------------");
		double sol4 = (double) x * (y+2*x)/3 * 5 + 4/(x-1);
		System.out.println(sol4);
		}
}
