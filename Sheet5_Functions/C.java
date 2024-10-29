import java.util.Scanner;

public class C {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isBinaryPalindrome(int n) {
        String binary = Integer.toBinaryString(n);
        String reversedBinary = new StringBuilder(binary).reverse().toString();
        return binary.equals(reversedBinary);
    }
    public static String isWonderful(int n) {

        if (isOdd(n) && isBinaryPalindrome(n)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input the number
        System.out.println(isWonderful(N)); // Output the result
        scanner.close();
    }

}
