package chap_05;

public class _10_breaky {
    public static void main(String[] args) {
        int max = 20;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }

        System.out.println("------------------------------------------");

        int number = 1;
        while( number <=50) {
            System.out.println(number + "번 손님 치킨 나왔습니다.");
            if (number == 20) {
                System.out.println("재료가 모두 소진되었습니다.");
                break;
            }
            number++;

        }
        System.out.println("금일 영업 종료합니다. ");
    }
}
