public class _10_Loops {

    public static void main(String[] args) {

        // while loop
        int sum = 0;
        while (sum < 100) {
            sum += 10; // sum = sum + 10;
        }
        System.out.println("sum is: " + sum);

        // do ... while
        sum = 0;
        do {
            sum += 50;
        } while (sum < 1000);
        System.out.println("sum is: " + sum);

        // infinity loop
        sum = 0;
        while (true) {
            // ?????
            sum += 10;
            if (sum > 1000000) {
                break;
            }
        }
        System.out.println("sum is: " + sum);

        // for loop
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // while equivalent
        int a = 0;
        while (a <= 10) {
            System.out.print(a + ", ");
            a++;
        }
        System.out.println();

        // while factorial
        final int n = 10;
        int result = 1;
        int k = 1;
        while (k <= n) {
            result *= k++;
        }
        System.out.println("Factorial from n=" + n + " is: " + result);

        // for equivalent
        result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial from n=" + n + " is: " + result);

        // fibonacci
        // 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181
        int n1 = 0;
        int n2 = 1;
        int tmp = 0;
        for (int i = 1; i < n; i++) {
            tmp = (n1 + n2);
            n1 = n2;
            n2 = tmp;
        }
        System.out.println("Fibonacci for n=" + n + " is " + tmp);
    }
}
