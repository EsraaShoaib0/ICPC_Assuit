import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double result = (double) A / B;
        int floorResult = (int) Math.floor(result);
        int ceilResult = (int) Math.ceil(result);
        int roundResult = (int) Math.round(result);
        System.out.println("floor " + A + " / " + B + " = " + floorResult);
        System.out.println("ceil " + A + " / " + B + " = " + ceilResult);
        System.out.println("round " + A + " / " + B + " = " + roundResult);
        sc.close();

    }
}