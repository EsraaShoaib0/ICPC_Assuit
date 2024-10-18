import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        sc.close();
    }
}