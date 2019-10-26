import java.util.Date;

public class _06_StringFormat {

    public static void main(String[] args) {
        // template for displaying strings with many variables
        System.out.printf("Hello %s! Your best number is: %d\n",
                "Kamil", 7);

        // float number
        System.out.printf("float number: %,.2f \n", 3333.33333);

        // date
        System.out.printf("%1$s %2$ta %2$tb %2$tY", "Today is", new Date());
    }
}
