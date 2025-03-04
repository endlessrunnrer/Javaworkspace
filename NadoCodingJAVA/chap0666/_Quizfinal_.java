package chap0666;

public class _Quizfinal_ {

    public static String getHiddenData(String data, int index) {

        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {

        String name = "유대현";
        String id = "082429-2943023";
        String phone = "010-4566-3333";

        System.out.println("이름 :" +getHiddenData(name, 1));
        System.out.println("주민등록번호 : " +getHiddenData(id, 8));
        System.out.println("전화번호 : " +getHiddenData(phone, 9));
    }
}
