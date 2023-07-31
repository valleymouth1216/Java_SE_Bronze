
public class class5 {
    public static void main(String args[]) {
        Integer i = new Integer(1);
        Number num = i; // アップキャスト
        msg(num);
    }
    
    static void msg(Integer i) {
        System.out.println("引数がInteger型のメソッドを呼び出しました");
    }
    
    static void msg(Number n) {
        System.out.println("引数がNumber型のメソッドを呼び出しました");
    }
}
