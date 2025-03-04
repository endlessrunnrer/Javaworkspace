public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재시간: " + time + " 시]");

        switch(time) {

            case 8:
                System.out.println("출근합니다. ");
                break;
            case 9:
                System.out.println("출근합니다. 아슬아슬한 성공!");
                break;
            case 10:
                System.out.println("응 지각이야. 어쩔티비. ");
                break;
            default:
                System.out.println("어쩔 수 없구나만. 여기 사직서입니다. ");


        }
    }
}
