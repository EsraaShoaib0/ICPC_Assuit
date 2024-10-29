
import java.util.Scanner;

public class O {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static int countPalindromes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static int maxDivisors(int[] arr) {
        int maxDivisorCount = 0;
        int numberWithMaxDivisors = 0;

        for (int num : arr) {
            int divisorCount = countDivisors(num);
            if (divisorCount > maxDivisorCount ||
                    (divisorCount == maxDivisorCount && num > numberWithMaxDivisors)) {
                maxDivisorCount = divisorCount;
                numberWithMaxDivisors = num;
            }
        }
        return numberWithMaxDivisors;
    }
    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int max = getMax(A);
        int min = getMin(A);
        int primeCount = countPrimes(A);
        int palindromeCount = countPalindromes(A);
        int numberWithMaxDivisors = maxDivisors(A);
        System.out.println("The maximum number : " + max);
        System.out.println("The minimum number : " + min);
        System.out.println("The number of prime numbers : " + primeCount);
        System.out.println("The number of palindrome numbers : " + palindromeCount);
        System.out.println("The number that has the maximum number of divisors : " + numberWithMaxDivisors);
        scanner.close();
    }
}
