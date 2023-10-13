
public class class19 {

    //メソッド１
    public void hoge(){
        System.out.println("hoge-None");
    }

    //メソッド２
    public void hoge(String a){
        System.out.println("hoge-String");
    }

    //メソッド３
    public void hoge(String a, int i){
        System.out.println("hoge-StringInt");
    }

    //メソッド４
    public void hoge(int i, String a){
        System.out.println("hoge-intString");
    }

    //throws句が異なってもオーバーロードにはならない（エラーになる）
    //public void hoge() throws Exception{
    //    System.out.println("hoge");
    //}

    //アクセス修飾子が異なってもオーバーロードにはならない（エラーになる）
    //private void hoge(){
    //    System.out.println("hoge");
    //}
  

}