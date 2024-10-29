import java.util.Scanner;

public class J {
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextDouble();
        }
        double average = calculateAverage(A);
        System.out.printf("%.6f\n", average);

        scanner.close();
    }
}
