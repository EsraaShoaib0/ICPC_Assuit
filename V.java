import java.util.Scanner;
/*
* Given a comparison symbol S between two numbers A and B. Determine whether it is Right or Wrong.

The comparison is as follows: A < B, A > B, A = B.

Where A,B are two integer numbers and S refers to the sign between them.

Input
Only one line containing A,S and B respectively, S can be ('<', '>','=') without the quotes.

Output
Print "Right" if the comparison is true, "Wrong" otherwise.
*
//!Solution
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();
        if((s.equals("<"))&&(a<b)){
            System.out.println("Right");

        }

        else if((s.equals(">"))&&(a>b)){
            System.out.println("Right");

        }

        else if((s.equals("="))&&(a==b)){
            System.out.println("Right");

        }
        else {
            System.out.println("Wrong");
        }
        sc.close();
    }
}