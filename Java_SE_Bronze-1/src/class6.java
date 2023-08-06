
public class class6 {

    public static void disp_str(String str, int val) {
        System.out.println(str + val);
}

public static void disp_str(int val, String str) {
        System.out.println(str + val);
}

public static void main(String[] args) {
        disp_str("1 文字列を渡しました", 100);
        disp_str("2 文字列を渡しました", 200);
}  
}
