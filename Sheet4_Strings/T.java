import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int queryStart = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '?') {
                queryStart = i + 1;
                break;
            }
        }
        String[] params = {"username", "pwd", "profile", "role", "key"};
        int currentPosition = queryStart;

        for (String param : params) {
            int paramStart = currentPosition;
            while (S.charAt(paramStart) != '=') {
                paramStart++;
            }
            int valueStart = paramStart + 1;
            int valueEnd = valueStart;
            while (valueEnd < S.length() && S.charAt(valueEnd) != '&') {
                valueEnd++;
            }
            String value = "";
            for (int j = valueStart; j < valueEnd; j++) {
                value += S.charAt(j);
            }
            System.out.println(param + ": " + value);
            currentPosition = valueEnd + 1;
        }



    }
}