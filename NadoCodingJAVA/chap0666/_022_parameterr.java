package chap0666;

public class _022_parameterr {

    public static void power(int number) {
        int result = number * number;
        System.out.println(number + " 의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {

        power(2);
        power(99999);
        powerByExp(2,64);
    }
}
