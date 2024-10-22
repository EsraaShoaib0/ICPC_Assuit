import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String S = scanner.next();

        // Check the length of the string
        if (S.length() != A + B + 1) {
            System.out.println("No");
            return;
        }

        // Check if the (A + 1)-th character is '-'
        if (S.charAt(A) != '-') {
            System.out.println("No");
            return;
        }

        // Check if all other characters are digits
        for (int i = 0; i < S.length(); i++) {
            if (i != A && !Character.isDigit(S.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        // If all checks pass
        System.out.println("Yes");
    }
}
