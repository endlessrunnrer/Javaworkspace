package chap_04444;

public class arrayy {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        System.out.println(coffees[0] + "one more");

        for (int i = 0; i < coffees.length ; i++) {
            System.out.println(coffees[i] + "하나 주세요.");
        }

        System.out.println("---------------------------------------------------------");

        for (String coffee: coffees) {
            System.out.println(coffee+ " 하나");
        }



    }
}
