import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] nums = new long[size];
        long sum = 0;
        for (int i =0;i<size;i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        System.out.println(Math.abs(sum));





    }
}