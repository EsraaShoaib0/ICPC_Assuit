import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + " " + B.length());
        System.out.print(A);
        System.out.println(B);
        char firstCharA = A.charAt(0);
        char firstCharB = B.charAt(0);
        System.out.print(firstCharB);
        for (int i = 1; i < A.length(); i++) {
            System.out.print(A.charAt(i));
        }
        System.out.print(" ");
        System.out.print(firstCharA);
        for (int i = 1; i < B.length(); i++) {
            System.out.print(B.charAt(i));
        }


    }
}