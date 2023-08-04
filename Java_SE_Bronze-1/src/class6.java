
public class class6 {

    public static void disp_str(String str) {
        System.out.println(str);
}

public static int disp_str(String str) {
        System.out.println(str);
        return 0;
}

public static void main(String[] args) {
        int r = disp_str("文字列を渡しました"); // これは判別できるが
        disp_str("もう一度、文字列を渡しました"); // これは判別できない。
}        
}
}
