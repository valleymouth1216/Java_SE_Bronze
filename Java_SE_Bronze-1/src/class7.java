
public class class7 {

    public static void disp_str() {
        System.out.println("パラメータがありません");
}

public static void disp_str(String str) {
        System.out.println(str);
}

public static void main(String[] args) {
        disp_str();
        disp_str("文字列を渡しました");
}        

}
