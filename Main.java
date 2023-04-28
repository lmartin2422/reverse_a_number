iimport java.util.*;

public class Main {
    public static void main(String[] args) {

        int num = 12345;
        int reversed = 0;
        while (num != 0) {

            int remainder = num % 10;  // assigns the remainder of the num/10 to the remainder variable
            System.out.println("Remainder: " +remainder);

            reversed = reversed * 10 + remainder;  // adds the remainder from above to newly stored reverse value
            System.out.println("Reversed: " + reversed);

            // same as num = num/10
            num /= 10;  // the initial num value is constantly updated reflecting the above divisions
            System.out.println("num: " +num);
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

/* num = num / 10 */
