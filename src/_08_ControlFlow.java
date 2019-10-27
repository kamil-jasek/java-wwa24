public class _08_ControlFlow {

    public static void main(String[] args) {

        // variable visibility in code blocks
        int k = 0;
        {
            int n = k + 1;
            k++;
            {
                int w = k++;
            }
        }
        System.out.println("k is: " + k);

        // if statements
        if (false) {
            System.out.println("is true");
        }

        if (k > 0) {
            System.out.println("k > 0");
        }

        if (k == 0) {
            System.out.println("k == 0");
        } else {
            System.out.println("k is not 0");
        }

        int w = 0;
        if (k < 0) {
            w = 10;
            System.out.println("k < 0");
        } else if (k > 0) {
            w = 20;
            System.out.println("k > 0");
        } else {
            w = 30;
            System.out.println("else");
        }

        System.out.println("w is: " + w);
        w++;

        if (k < 0) ; // --> watch out!!
        {
        }


        // switch statement
        // a switch works with the byte, short, char, int primitive data types
        // it works also with String and enumerated types.

        k = 2;
        switch (k) {
            case 1:
                System.out.println("k is 1");
                break;
            case 2:
                System.out.println("k is 2");
                break;
            case 3:
                System.out.println("k is 3");
                break;
            default:
                System.out.println("default");
        }

        // switch with String
        String menu = "String";
        String selected = null;
        switch (menu) {
            case "O mnie":
                System.out.println("o mnie");
                selected = "o mnie";
                break;
            case "Start":
                System.out.println("start");
                selected = "start";
                break;

            default:
                System.out.println("other menu");
        }

        if (selected == null) {
            selected = "not selected";
        }
        System.out.println("Selected menu: " + selected);

        // break to outer block
        outer:
        {
            int y = 0;
            {
                int u = y + 1;
                if (u == 1) {
                    break outer;
                }
            }
            w = 40;
            System.out.println("w is " + w);
        }

    }
}
