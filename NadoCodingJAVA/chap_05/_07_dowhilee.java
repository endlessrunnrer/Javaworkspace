package chap_05;

public class _07_dowhilee {
    public static void main(String[] args) {
        int dis = 25;
        int move = 0;
        int height = 2;
        while (move + height < dis) {
            System.out.println("He is keep paddling");
            System.out.println("Current distance is: " +move);
            move += 3;




        }

        do {
            System.out.println("He is still kicking");
            System.out.println("now distance :" +move);
            move += 3;
        } while (move + height < dis);
        System.out.println("He arrived");

    }
}
