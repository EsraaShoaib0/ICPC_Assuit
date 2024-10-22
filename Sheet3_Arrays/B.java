import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i =0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        boolean exist = false;
        int i;
        for (i =0 ; i<size;i++)
        {
            if (nums[i]==num)
            {
                exist = true;
                break;
            }
        }
        if (exist){
            System.out.println(i);
        }
        else {
            System.out.println(-1);
        }


    }
}