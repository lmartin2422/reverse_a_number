import java.util.*;

public class Main {
    public static void main(String[] args) {

        int num = 12345;
        int reversed = 0;
        while (num != 0) {

            int remainder = num % 10;
            System.out.println("Remainder: " +remainder);

            reversed = reversed * 10 + remainder;
            System.out.println("Reversed: " + reversed);

            num /= 10;
            System.out.println("num: " +num);
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

/* num = num / 10 */