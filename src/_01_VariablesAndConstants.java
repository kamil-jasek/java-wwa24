public class _01_VariablesAndConstants {

    public static void main(String[] args) {
        // declare variable
        int var1;

        // variable must be initialized before use
        // System.out.println(var1);

        // assign value
        var1 = 1;

        // print var1
        System.out.println("var1 is: " + var1);

        // initialize variable
        int var2 = 2;
        System.out.println("var2 is: " + var2);

        // change value
        var1 = 2;
        var2 = 1;
        System.out.println("var1: " + var1 + ", var2: " + var2);

        var1 = var2;
        System.out.println("var1: " + var1 + ", var2: " + var2);

        // constant
        final int constant1 = 1;
        // cannot change constant value
        // constant1 = 2;
        System.out.println("constant1 is: " + constant1);

        var2 = constant1;
        System.out.println("var2 is: " + var2);

        // initialize constant from variable
        final int constant2 = var1;
        var1 = 5;
        System.out.println("constant2: " + constant2 +
                "var1: " + var1);
    }
}
