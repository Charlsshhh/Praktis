import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            pln("Math Operations");
            pln(" 1. Addition");
            pln(" 2. Subtractin");
            pln(" 3. Multiplication");
            pln(" 4. Division");
            pln(" 0. Exit");

            p("\nInput Operation: ");
            int op = scan.nextInt();

            if (op == 0) {
                pln("\nProgram Terminated! Goodbye.");
            }

        }

        while (false);

    }

    public static void pln(String str) {
        System.out.println(str);
    }

    public static void p(String str) {
        System.out.print(str);
    }
}