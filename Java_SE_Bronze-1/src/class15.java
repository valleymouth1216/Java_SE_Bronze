
public class class15 {
    public static void main(String[] args) {
        System.out.println(add(1, 2)); // (1)が呼び出される
        System.out.println(add(1, 2, 3)); // (2)が呼び出される
    }

    public static int add(int x, int y) { // (1)引数が2つ
        int num = x + y;
        return num;
    }

    public static int add(int x, int y, int z) { // (2)引数が3つ
        int num = x + y + z;
        return num;
    }
}
 

