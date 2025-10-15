// 38. Write a Java program to find the sum of all even digits from a given number.
public class Q38_SumOfEvenDigits {
    public static void main(String[] args) {
        
        int n = 12345;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // extract last digit
            if (digit % 2 == 0) { // check even
                sum += digit;
            }
            n = n / 10; // remove last digit
        }

        System.out.println("Sum of even digits = " + sum);
    }
}
