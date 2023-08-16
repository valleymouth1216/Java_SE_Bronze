
public class class10 {
    public static void disp_val(int val) {
        System.out.println("int型の" + val);
}

public static void disp_val(float val) {
        System.out.println("float型の" + val);
}





      

public static void main(String args[]){
    System.out.println(plus(10, 7));
    System.out.println(plus(3.2, 4));
    System.out.println(plus(7, 1.223));
    System.out.println(plus(5.08, 2.4));
  }

  private static int plus(int n1, int n2){
    System.out.println("int + int");
    return n1 + n2;
  }

  private static double plus(int n1, double d1){
    System.out.println("int + double");
    return n1 + d1;
  }

  private static double plus(double d1, int n1){
    System.out.println("double + int");
    return n1 + d1;
  }

  private static double plus(double d1, double d2){
    System.out.println("double + double");
    return d1 + d2;
  }
  
  

      
      Calculation cal = new Calculation();
      System.out.println("引数2つ(int型)のメソッド：" + cal.add(2,2));
      System.out.println("引数1つ(int型)のメソッド：" + cal.add(10));
      System.out.println("引数2つ(double型)のメソッド：" + cal.add(2.5,1.1));

  
}
