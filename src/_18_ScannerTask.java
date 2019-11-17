import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _18_ScannerTask {

    public static void main(String[] args) {
        // add integers to the list via scanner
        // when user say "stop" then calculate min and max from list
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Please provide next number or 'stop'");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            if (input.matches("-?\\d+")) {
                Integer number = Integer.valueOf(input);
                numbers.add(number);
            } else {
                System.out.println("Provided input is not number!");
            }
        }
        System.out.println("Provided numbers: " + numbers);
        System.out.println("Max is: " + Collections.max(numbers));
        System.out.println("Min is: " + Collections.min(numbers));

        scanner.close();
    }
}
