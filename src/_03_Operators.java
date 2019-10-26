public class _03_Operators {

    public static void main(String[] args) {
        // arithmetical operators: +, -, /, *, %
        byte plus = 122 + 5;
        int plus2 = plus + 20;

        System.out.println(plus2 + plus);
        System.out.println("napis: " + (plus2 + plus));

        int multiply = plus * 10;
        int division = plus / 100;
        System.out.println("multiply: " + multiply);
        System.out.println("division: " + division);

        // int divideByZero = plus / 0; --> watch out!!

        double d1 = 100.0 / 0; // d1 is Infinity here
        System.out.println("divide by zero with double: " + d1);

        System.out.println(15 / 2.0);
        System.out.println(15 % 7);

        // shortcuts
        int x = 4;
        x = x + 4;
        System.out.println("x is: " + x);
        int y = 4;
        y += 4;

        // increment and decrement
        x = 1;
        x = x + 1;
        x = x + 1;

        y = 1;
        y++;
        System.out.println("y: " + y);
        System.out.println("y: " + y++);
        System.out.println("y: " + ++y);

        int w = 0;
        w--;
        System.out.println("w: " + w);
        System.out.println("w: " + --w);
        System.out.println("w: " + w--);
        System.out.println("w: " + w);

        // logical operators
        boolean b1 = (3 == 7);
        System.out.println("b1 is: " + b1);
        b1 = (0 != 0);
        System.out.println("b1 is: " + b1);

        boolean gt = (5 > 4);
        boolean gte = (5 >= 4);
        boolean lt = (4 < 5);
        boolean lte = (4 <= 5);

        int x1 = 5;
        int y1 = 4;
        boolean trueOrFalse = (((x1 > 0 && y1 == 4) || (y1 < 0 && x1 >= 3)) && (!gte));
        System.out.println("true or false: " + trueOrFalse);

        // binary operators
        // & - and
        // | - or
        // ^ - xor
        // ~ - negation
        // >>, << - shift operators
        int b0 = 1 & 0;
        System.out.println("b0 is: " + b0);


    }
}
