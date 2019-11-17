import java.util.Scanner;

public class _17_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your choice");
        String choice = scanner.nextLine();
        System.out.println("Choice is: " + choice);

        switch (choice) {
            case "menu1":
                System.out.println("user selected menu1");
                break;
            case "menu2":
                System.out.println("user selected menu2");
                break;
            default:
                System.out.println("user selected wrong option");
                break;
        }

        int selectedNumber = scanner.nextInt();
        System.out.println("selected int: " + selectedNumber);

        scanner.close();
    }
}
