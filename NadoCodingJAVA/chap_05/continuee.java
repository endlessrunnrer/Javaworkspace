package chap_05;

public class continuee {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 15;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+ "번 손님 치킨 맛있게 드세요.");

            if(i == noShow){
                System.out.println(i+ "번 소님이 없나요? 다음 손님 주문 처리하겠습니다.");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("===========================================================");

        int index = 1;
        sold = 0;
        while (index <= 50) {
            System.out.println( index+ "번 손님 주문하신 꼬꼬 나왔어요.");

            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해서 다음 손님에게 꼬꼬를 팔겠습니다.");
                index++;
                continue;  // continue를 실행하게 되면 밑에 문장들을 실행하지 않고, 다시 처음으로 돌아간다..
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
            index++;

        }
        System.out.println(index);
    }
}
