import java.util.Scanner;
/*
Given 3 numbers A, B and C, Print the minimum and the maximum numbers.

Input
Only one line containing 3 numbers A, B and C 

Output
Print the minimum number followed by a single space then print the maximum number.
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        int min = a;
        if (c>max)
        {
            max = c;
        }
        if (c<min)
        {
            min = c;
        }
        if(b>max){
            max = b;
        }
        if (b<min)
        {
            min = b;
        }
        System.out.println(min+" "+max);
        sc.close();

    }
}