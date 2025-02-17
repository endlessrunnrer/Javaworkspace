import java.io.IOException;

public class KeyCodeExample {
    public static void main(String[] args) throws IOException {
        int keyCode = System.in.read();  // 문자 하나 입력받기
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}
