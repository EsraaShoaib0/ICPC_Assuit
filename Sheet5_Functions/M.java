
import java.util.Scanner;

public class M {
    public static int countDistinct(int[] arr) {
        int distinctCount = 0; // Initialize count of distinct numbers

        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true; //
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinctCount++;
            }
        }

        return distinctCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int distinctCount = countDistinct(A);
        System.out.println(distinctCount);

        scanner.close();
    }
}
