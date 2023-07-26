
public class class3 {

	
	//オーバーロード
	public static void main(String args[]){
		  int n = plus(10, 7);
		  System.out.println(n);

		  double d = plus(3.14, 7.4);
		  System.out.println(d);
		}

		private static int plus(int n1, int n2){
		  return n1 + n2;
		}

		private static double plus(double d1, double d2){
		  return d1 + d2;
		}
		
}
