import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();
        long Y = sc.nextInt();
        long summation = X + Y;
        long multiplication = X * Y;
        long subtraction = X - Y;
        System.out.println(X + " + " + Y + " = " + summation);
        System.out.println(X + " * " + Y + " = " + multiplication);
        System.out.println(X + " - " + Y + " = " + subtraction);
        sc.close();
    }
}