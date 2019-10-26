public class _04_String {

    public static void main(String[] args) {
        // strings are immutable
        String abc = "abc";
        abc = abc + "cde";

        // how to create Strings
        String str1 = new String(); // it's empty string
        String str2 = "";
        String str3 = new String("");

        // how to concatenate strings
        String str4 = str1 + "test";
        System.out.println(str4);

        // how to compare strings
        boolean equals = (str1 == str2); // don't use '==' with objects
        System.out.println("is equal: " + equals);
        equals = (str1.equals(str2));
        System.out.println("is equal: " + equals);

        String upperCase = "DADA";
        String loweCase = "dada";
        equals = upperCase.equalsIgnoreCase(loweCase);
        System.out.println("Equals is: " + equals);

        // what is the length
        System.out.println("ala ma kota".length());

        // how to get substring
        String str5 = "ala ma kota";
        System.out.println("substring is: " + str5.substring(4, 6));

        // how to replace characters
        String word = "ala ma kota";
        // a -> u
        System.out.println(word.replace('a', 'u'));

        String word2 = word.replaceAll("[a-z]a", "zz");
        String expected = "azz zz kozz";
        System.out.println("is equal: " + (expected.equals(word2)));

        String postcodeRegex = "\\d\\d-\\d\\d\\d";
        // "\\d{2}-\\d{3}"
        String postcode = "01-340";
        String notPostcode = "02345B";

        System.out.println("01-340 is postcode: " + postcode.matches(postcodeRegex));
        System.out.println("02345B is postcode: " + notPostcode.matches(postcodeRegex));

        // how to remove white spaces on start and end
        String str6 = "   napis  ksk   ";
        System.out.println(str6.trim());

        // how to check if string contains substring
        System.out.println("ala ma kota".contains("kota"));

        // how to uppercase/lowercase
        System.out.println("ala ma kota".toUpperCase());
        System.out.println("ALA MA KOTA".toLowerCase());

        // how to check if string starts/ends with some characters
        boolean startsWith = "ala ma kota".startsWith("ala");
        System.out.println("starts with: " + startsWith);
        boolean endsWith = "ala ma kota".endsWith("kota");
        System.out.println("ends with: " + endsWith);

        // how to compare strings
        int result = "ala ma kota".compareTo("ula ma kota");
        System.out.println("compare result is: " + result);
    }
}
