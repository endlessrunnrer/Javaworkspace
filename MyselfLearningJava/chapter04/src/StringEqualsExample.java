public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "유해성";
        String strVar2 = "유해성";

        if(strVar1 == strVar2 ) {
            System.out.println("strVar1과 strVar2의 참조는 서로 같다.");
        } else {
            System.out.println("strVar1과 strVar2의 참조는 서로 다르다. ");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음.");
        }

        String strVar3 = new String ("유해성");
        String strVar4 = new String ("유해성");

        if(strVar3 == strVar4 ) {
            System.out.println("strVar3과 strVar4의 참조는 같다. ");

        } else {
            System.out.println("strVar3과 strVar4의 참조는 다르다. ");

        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음. ");
        }
    }
}
