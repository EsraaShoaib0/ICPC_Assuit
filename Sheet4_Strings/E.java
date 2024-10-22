import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int sum = 0;
        for(int i =0; i<A.length();i++)
        {
            sum += A.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}