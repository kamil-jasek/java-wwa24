import java.util.Arrays;
import java.util.List;

public class _16_ArrayListTask {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 44, -39, 4, 22, 99, 1, 0, 66);
        // find min and max
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : numbers) {
            max = max < i ? i : max;
            // max = Math.max(max, i);
            min = min > i ? i : min;
            // min = Math.min(min, i);
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }
}
