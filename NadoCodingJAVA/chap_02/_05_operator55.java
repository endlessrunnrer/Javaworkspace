package chap_02;

public class _05_operator55 {
    public static void main(String[] args) {

        //삼항 연산자ㅏ  importantt..  caz i don't know it
        int x = 5;
        int y = 3;
        int max = (x > y)  ?  x : y ;
        System.out.println(max);

        int min = ( x < y) ? x : y;
        System.out.println(min);

        String s = (x != y) ? "달라요" : "같아요.";
        System.out.println(s);
    }
}
