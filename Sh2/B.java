import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if (n==1){
            System.out.println(-1);
        }
        for (long i =2; i<=n ; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}