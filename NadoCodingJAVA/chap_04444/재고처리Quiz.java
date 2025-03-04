package chap_04444;

public class 재고처리Quiz {

    public static void main(String[] args) {
        // 신발사이즈는 250 부터 295까지 5단위로 증가..          신발 사이즈는 총 10가지ㅣ
//        int shoe [] = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
//        for (int i = 0; i < shoe.length; i++) {
//            System.out.println("사이즈 " +shoe[i] + " (재고 있음)");
//
//        }

        int[] sizes = new int[10];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i]= 250 + (5 * i);

        }
        for (int realsize : sizes) {
            System.out.println("사이즈" + realsize + " (재고있음)");
        }



    }
}
