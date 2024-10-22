import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')) {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println(wordCount);

    }
}