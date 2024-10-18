import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592653;
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double area = PI * R * R;
        System.out.printf("%.9f\n", area);
        sc.close();
    }
}