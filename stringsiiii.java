import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class stringsiiii {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length, maxlength;
        String userinput, x, z = "";
        System.out.print("Enter a string: ");
        userinput = input.next();
        length = userinput.length();
        maxlength = length;
        while (length != 0) {
            x = userinput.substring(maxlength - length, maxlength - length + 1);
            z = z + x + x;
            length -= 1;

        }

        System.out.println(z);

        int count, counter = 0;
        System.out.print("Enter string: ");
        userinput = input.next();
        count = userinput.indexOf("hi");
        while (count >= 0) {
            counter += 1;
            userinput = userinput.replaceFirst("hi", "");
            count = userinput.indexOf("hi");
        }
        System.out.println("hi counter: " + counter);

    }
}
