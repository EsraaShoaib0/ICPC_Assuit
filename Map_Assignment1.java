import java.util.*;

public class Map_Assignment1 {
    public static void main(String[] args) {
    Map<String,Integer> countries= new HashMap<>();
    System.out.println("Please Enter the number of Countries:....");
    Scanner scanner = new Scanner(System.in);
    int country_number = scanner.nextInt();
    String name;
    int per;
    while (country_number!=0){
        System.out.println("Enter the country name :");
        name = scanner.next();
        System.out.println("Enter the country percentage :");
        per = scanner.nextInt();
        if (countries.containsKey(name)){
            per+=countries.get(name);
        }
        countries.put(name,per);
        country_number--;
    }
    System.out.println(countries);
    }
}