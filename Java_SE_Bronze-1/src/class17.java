
public class class17 {


String color;

public SampleRobot() {  // コンストラクタ
    System.out.println("こんにちは。");
}

public SampleRobot(String color) {  // 色を指定する場合のコンストラクタ
    this.color = color;
    System.out.println("こんにちは。私の色は" + color + "です。");
}
}

public class Java_overload {
public static void main(String[] args) {
    SampleRobot robot = new SampleRobot();
    SampleRobot blueRobot = new SampleRobot("青");
}
}