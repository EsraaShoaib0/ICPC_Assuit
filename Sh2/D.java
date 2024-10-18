import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pas;
        while(true)
        {
            pas = sc.nextInt();
            if(pas == 1999)
            {
                System.out.println("Correct");
                break;
            }
            else {
                System.out.println("Wrong");
            }
        }
        sc.close();
    }
}