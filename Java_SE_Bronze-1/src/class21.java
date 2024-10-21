
public class class21 {
	public static void main(String[] args) {
	    System.out.println(add(1, 2));      // (1)が呼び出される
	    System.out.println(add(1.2, 3.4));  // (2)が呼び出される
	    System.out.println(add(1, 2, 3));   // (3)が呼び出される
	    System.out.println(add(1, 2.3));    // (4)が呼び出される
	    System.out.println(add(1.2, 3));    // (5)が呼び出される
	}
	
	
		

	public static int add(int x, int y) { // (1) int, int
	    int num = x + y;
	    return num;
	}

	public static double add(double x, double y) { // (2) double, double
	    double num = x + y;
	    return num;
	}

	public static int add(int x, int y, int z) { // (3) int, int, int
	    int num = x + y + z;
	    return num;
	}

	public static double add(int x, double y) { // (4) int, double
	    double num = x + y;
	    return num;
	}

	public static double add(double x, int y) { // (5) double, int
	    double num = x + y;
	    return num;
	}
	
	
}
