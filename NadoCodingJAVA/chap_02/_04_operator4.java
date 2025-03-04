package chap_02;

public class _04_operator4 {
    public static void main(String[] args) {

        boolean  sex = true;
        boolean  sexy = false;
        boolean sexy_woman = true;

        System.out.println(sex||sexy||sexy_woman);   // if one thing among them is ture. then all true.


        //and 연산ㄴㄴ
        System.out.println(sex && sexy && sexy_woman); // if eveyrone is true. then true.. if someone is false then it's false.
        System.out.println( (23423> 3333) && (43< 2333));


        // or 여산
        System.out.println((5<333) || (23423 <4444333));


        // 논리 부정 연산자ㅏㅏ

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2342342>2423434));
    }

}
