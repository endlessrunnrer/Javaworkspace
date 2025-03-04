package chap0666;

public class _05_overload {

    public static int getPower (int number) {
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }


    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,4  ));
    }
}
