public class ArrayCreateByValueList {
    public static void main(String[] args) {
        int[] score = { 83, 90, 87};

        System.out.println("scores[0] : " + score[0]);
        System.out.println("scores[1] : " + score[1]);

        System.out.println("scores[2] : " +  score[2]);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += score[i];

        }
        System.out.println("총합 : " + sum);
        double avg= (double) sum / 3;
        System.out.println("평균 : "  + avg);

    }
}
