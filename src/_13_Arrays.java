import java.util.Arrays;

public class _13_Arrays {

    public static void main(String[] args) {
        // indexed 0, 1, 2, ... n data structure
        int[] x = new int[10];
        // set values to array
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;

        // get elements of array
        System.out.println("element at index 0: " + x[0]);

        String[] names = new String[] {"Kamil", "Janek", "Zosia"};
        System.out.println(Arrays.toString(names));
        System.out.println("First name: " + names[0]);

        // what if index is out of bounds??
        int idx = 9;
        if (idx < x.length && idx >= 0) {
            int y = x[idx];
            System.out.println("y is: " + y);
        }

        // how to print array values?
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "=" + x[i]);
        }

        // print sum of array elements, use x
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i]; // sum = sum + x[i]
        }
        System.out.println("sum is: " + sum);


        // enhanced for
        for (int i : x) {
            System.out.println("i = " + i);
        }

        int sum2 = 0;
        for (int i : x) {
            sum2 += i;
        }
        System.out.println("sum2 is: " + sum2);


        // prime numbers: https://pl.wikipedia.org/wiki/Sito_Eratostenesa
        int n = 100;
        boolean[] primes = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                continue;
            }
            for (int j = 2 * i; j < n; j += i) {
                primes[j] = true;
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (!primes[i]) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        //
        System.out.println("is prime number: " + !primes[33]);
    }
}
