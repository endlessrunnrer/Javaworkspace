package chap0666;

public class _08_mainmethodd {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

         if (args.length == 1) {
             switch (args[0]) {
                 case "1" :
                     System.out.println("도서 조회 메뉴입니다. ");
                     break;
                 case "2" :
                     System.out.println("도서 대출 메뉴입니다. ");
                     break;
                 case "3" :
                     System.out.println("도서 반납 메뉴입니다. ");
                     break;
                 default :
                     System.out.println("입력이 잘못되었습니다. ");
             }
         } else {
             System.out.println("사용법) 1~3까지의 메뉴 중 하나를 입력하세요.. ");
         }
    }
}
