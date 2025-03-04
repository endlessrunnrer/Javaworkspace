package NadoCoding_JAVA.chpater_01;

public class _07_typecastingg {
    public static void main(String[] args) {

        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.F;
        double score_d = 98.55;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score = 93 + (int)98.5;
        System.out.println(score);

        score_d = 93 + (double)98.5;
        System.out.println(score_d);

        double convertedScoreDouble = score;

        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d;


        String sq = String.valueOf(93);
        sq = Integer.toString(93);
        System.out.println(sq);

        String s3 = String.valueOf(98.5);
        s3 = Double.toString(98.5);
        System.out.println(s3);

        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.98");
        System.out.println(d);
    }
}

