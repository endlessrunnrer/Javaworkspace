package chap_02;

public class _quiz_02 {
    public static void main(String[] args) {

        int kid_a = 115;
        int kid_b = 121;


        String reach = (kid_a >= 120) ? "탑승 가능" : "탑승 불가능";

        System.out.println("키가 " + kid_a + "cm 이므로 " + reach + "합니다.");


        String reaching = (kid_b >= 120) ? "탑승 가능" : "탑승 불가능";


        System.out.println("키가 " + kid_b + "cm 이므로 " + reaching + "합니다.");

    }
}
