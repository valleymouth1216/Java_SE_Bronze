
public class Class13 {
 
        public static void disp_val(char val) {
                System.out.println("char型の" + val);
        }
 
        public static void disp_val(byte val) {
                System.out.println("byte型の" + val);
        }
 
        public static void disp_val(int val) {
                System.out.println("int型の" + val);
        }
 
        public static void disp_val(long val) {
                System.out.println("long型の" + val);
        }
        
        public static void disp_val(float val) {
                System.out.println("float型の" + val);
        }
 
        public static void disp_val(double val) {
                System.out.println("double型の" + val);
        }
 
        public static void main(String[] args) {
                disp_val('a');
                disp_val((byte)100);
                disp_val(100);
                disp_val(100l);
                disp_val(100.0f);
                disp_val(100.0d);
        }
        
}
 