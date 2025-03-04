package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(3+234234);
        System.out.println(999/3333333);

        System.out.println(4%3);

        System.out.println(2 + 3 *4);
        System.out.println((2+33) * 3 );


        int a =323;
        int b = 222334;
        int c;

        c = a + b;

        System.out.println(c);

        c = a-b;

        System.out.println(c);

        c = a*b;
        System.out.println(c);

        // 증감 연산자 많이 헷갈림 주의 요함!!!!!

        int val;
        val = 102;

        System.out.println(val);
        System.out.println(val++);
        System.out.println(++val);

        val = 10;

        System.out.println(val--);
        System.out.println(val);

        int waiting = 0;
        System.out.println("대기 인원:  "  + waiting++);
        System.out.println("대기 인원:  "  + waiting++);
        System.out.println("대기 인원:  "  + waiting++);
        System.out.println("총 대기 인원: " + waiting);



    }
}
