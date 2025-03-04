package chap0666;

public class _03_Returnn {

    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;

    }
    public static String getAddress() {
        return " 서울시 어딘가";
    }

    public static String getActivities() {
        return "볼링장, 당구장, 노래방";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호는 :  " +contactNumber);

        String address = getAddress();
        System.out.println(" 호텔 주소 : " +address);

        System.out.println("호텔 액티비티 : " +getActivities());

    }
}
