public class newex2 {
    public static void main(String[] args) {
        int v1 = 10;
        if (true) {
            int v2 = 0;
            if (true) {
                int v3 = 0;
                v1 = 1;
                v2 = 2;
                v3 = 3;

            }
            v1 = v2 ;
        }
        System.out.println(v1);
    }
}
