
public class class4 {

	    
	    public static void main(String args[]) {
	        msg("佐藤");
	        msg("山田", "はじめまして");
	    }
	    
	    static void msg(String name) {
	        System.out.println("こんにちは、" + name + "です");
	    }
	    
	    static void msg(String name, String greeting) {
	        System.out.println(greeting + "、" + name + "です");
	    }
}
