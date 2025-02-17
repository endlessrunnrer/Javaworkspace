import java.io.IOException;

public class QstopExample {
    public static void main(String[] args) throws IOException {


        int keyCode;

        keyCode = System.in.read();
        while(true) {
            System.out.println("keyCode: " +keyCode);
            if(keyCode == 113) {
                break;
            }
        }
    }
}
