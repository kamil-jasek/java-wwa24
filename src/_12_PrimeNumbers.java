public class _12_PrimeNumbers {

    public static void main(String[] args) {

        // prime numbers
        StringBuilder builder = new StringBuilder();
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = i; j >= 2; j--) {
                if (i % j == 0) {
                    count++;
                    if (count == 2) {
                        break;
                    }
                }
            }
            if (count < 2) {
                builder.append(i).append(',');
            }
        }
        System.out.println(builder);
    }
}
