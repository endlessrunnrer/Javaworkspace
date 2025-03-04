package chap_05;

public class quiz0444 {
    public static void main(String[] args) {
/*
        int fee = 0;
        int special;

        for (int i = 0; i < 24; i++) {
            fee = fee + 4000;
            System.out.println(i+ "시간 주차햇습니다. 요금은 " +fee);
            special = fee / 2;
            if()

        }
*/

        int hour = 10;
        boolean isSmallCar = true;
        boolean withDisabledPerson = false;

        int fee = hour * 4000;

        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            fee = fee / 2;

        }

        System.out.println("주차 요금은  " + fee + "입니다.");





    }


}
