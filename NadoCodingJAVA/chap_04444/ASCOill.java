package chap_04444;

public class ASCOill {
    public static void main(String[] args) {

        String[][] seats3 = new String [10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);

            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");


            }
            System.out.println();
        }
    }
}
