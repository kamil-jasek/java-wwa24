public class _02_Types {

    public static void main(String[] args) {
        // integer numbers

        // byte
        byte b1 = 127;
        byte b2 = -128; // 1B

        b1 = (byte) 128; // watch out!!
        System.out.println("b1 is: " + b1);

        // short
        short s1 = 32_767;
        short s2 = -32_768;  // 2B

        // int
        int i1 = 2_147_483_647;
        int i2 = -2_147_483_648; // 4B

        // long
        long l1 = 9_223_372_036_854_775_807L;
        long l2 = -9_223_372_036_854_775_808L; // 8B

        // floating point numbers
        float f1 = 0.9999992353252342F;
        System.out.println("f1 is: " + f1); // 4B

        double d1 = 0.3424234;
        double d2 = 0.3938843D; // 8B

        // booleans
        boolean ok = true;
        boolean notOk = false;
        ok = !false;
        notOk = !true;
        System.out.println("ok: " + ok + ", NotOK: " + notOk);
        ok = !notOk;
        notOk = !ok;
        System.out.println("ok: " + ok + ", notOK: " + notOk);

        // chars
        char c1 = 'c';
        char c2 = '&';
        System.out.println(c1 + c2);
        System.out.println(c1 + 0);
        System.out.println("c1: " + c1);

        // casting integer
        long l3;
        l3 = b1;  // byte
        l3 = s1;  // short
        l3 = i1;  // int

        // b1 = s1; will not compile

        // same rule
        d1 = f1;
        // exceptions
        d1 = l3;
        System.out.println("d1 is: " + d1);
        f1 = l3;
        f1 = i1;
        System.out.println("f1 is: " + f1);

        // reference types
        String word1 = null;
        System.out.println("word1: " + word1);

        // word1.length();

        word1 = "napis";
        System.out.println("word1: " + word1);
    }
}
