package chap_04444;

public class arraaayyyy {
    public static void main(String[] args) {
        String[][] seats = new String [10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = eng[i] + (j + 1);
            }
        }
        System.out.println(seats.length);
    }
}
