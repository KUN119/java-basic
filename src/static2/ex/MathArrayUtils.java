package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private: 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];

        for (int value : values) {
            if(min > value){
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];

        for (int value : values) {
            if(max < value){
                max = value;
            }
        }

//        for (int value : values) {
//            max = Math.max(max, value);
//        }

        return max;
    }
}
