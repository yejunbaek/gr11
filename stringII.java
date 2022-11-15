import java.util.Scanner;

public class stringII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String userinput;
        // do {
        // System.out.print("Enter name: ");
        // userinput = input.next();
        // if (userinput.startsWith("Mrs")) {
        // System.out.println("Hello ma'am");
        // } else if (userinput.startsWith("Mr")) {
        // System.out.println("Hello sir");
        // } else if (userinput.equals("exit")) {
        // break;

        // } else {
        // System.out.println("Hello " + userinput);
        // }
        // } while (!(userinput.equals("exit")));
        // System.out.println("Goodbye");

        // 2
        String userinput1, userinput2;
        System.out.println("Enter words: ");
        userinput1 = input.next();
        userinput2 = input.next();
        if (userinput1.compareTo(userinput2) > 0) {
            System.out.println(userinput2 + ", " + userinput1);
        } else {
            System.out.println(userinput1 + ", " + userinput2);
        }

    }
}
