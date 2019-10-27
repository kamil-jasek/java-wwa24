public class _11_FizzBuzz {

    public static void main(String[] args) {
        // Write a program which prints numbers from 1 to 100
        // but for multiplies of 3 then print "Fizz"
        // and for multiplies of 5 then print "Buzz"
        // and for multiplies of 5 and 3 then print "FizzBuzz"

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
