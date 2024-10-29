import java.util.Scanner;

public class G {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();
        int[] A = new int[N]; // Initialize the array

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Find minimum and maximum
        int min = findMin(A);
        int max = findMax(A);

        // Print the result
        System.out.println(min + " " + max);

        scanner.close();
    }
}
