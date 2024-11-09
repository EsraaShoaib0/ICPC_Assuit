import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        //(((())()()))
        String bracket = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String s2="";
        String s = "";
        for (int i =0; i<bracket.length();i++)
        {
            if (bracket.charAt(i) == '(')
            {
                s= bracket.charAt(i)+"";
                stack.push(s);
            }
            if (bracket.charAt(i) == ')')
            {
                stack1.push(s+bracket.charAt(i));
                if(stack.isEmpty())
                {
                    System.out.println("False");
                    break;
                }
                else {
                    stack.pop();
                    stack1.pop();
                }
            }
        }
        if (stack.isEmpty()&&stack1.isEmpty())
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }*/
       /* String s = "hi";
        String s2 = "hi";
        System.out.println(s == s2);// because we compare two objects addresses and as they have the same value then refer to the same address
        */
        System.out.println("Please Enter the number of Employees:...");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Map<String,Integer> employees  = new HashMap<>();
        String name ;
        for (int i = 0; i<num;i++)
        {
            name = scanner.next();
            employees.put(name,0);
        }
        int sal = 0;
        for (;;)
        {
            System.out.println("Please Enter the name of the Employee:...");
            name = scanner.next();
            System.out.println("Please Enter His Salary");
             sal = scanner.nextInt();
             if (sal ==0)
             {
                 break;
             }
             //TODO
            if (employees.containsKey(name))
            {
                sal+= employees.get(name);
                employees.put(name,sal);
                sal = 0;
            }
            else {
                System.out.println("Please Enter a valid name");
            }
        }
        System.out.println(employees);
    }
}