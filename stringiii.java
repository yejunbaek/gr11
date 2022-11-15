import java.util.Scanner;

public class stringiii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput, userinput2;

        do {
            System.out.print("Enter first string: ");
            userinput = input.next();
            if (userinput.equals("0")) {
                break;
            } else {
                System.out.print("Enter second string: ");
                userinput2 = input.next();
                System.out.println(userinput + " " + userinput2 + " " + userinput2 + " " +
                        userinput);
            }
        } while (!(userinput.equals("0")));
        System.out.println("Goodbye");

        String x, y;
        System.out.print("Enter string: ");
        userinput = input.next();
        while (userinput.length() < 4) {
            System.out.print("Enter a string with or more than 4 characters: ");
            userinput = input.next();
        }
        x = userinput.substring(0, 2);
        y = userinput.substring(2, 4);
        System.out.println(y + x + userinput.substring(4));
    }
}
