public class Computer {

    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            // index는 0부터 시작. 그래서 배열 길이-1까지.
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];

        }
        return sum;
    }
}
