import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int num;
        for (int i =0;i<N;i++)
        {
            num = sc.nextInt();
            if(num>max)
            {
                max = num;
            }
        }
        System.out.println(max);
        sc.close();
    }
}