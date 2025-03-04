package chap_05;

public class for문 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++ ) {
            System.out.println("Hello, this is Rona. " + i);

        }
        // fori 누르면 roRna.
        for (int i = 0; i <= 10; i+=2) {
            System.out.print(i);     //println에서 ln을 빼면 한 줄씩 출력되지 않고, 전부 다 출력 된다.
        }

        System.out.println();

        for (int i = 1; i <= 10; i+=2) {
            System.out.print(i);     //println에서 ln을 빼면 한 줄씩 출력되지 않고, 전부 다 출력 된다.

        }

        int sum =  0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("The total sum is " + sum + "!!");
        }
        System.out.println("From one to ten is " + sum);

    }
}
