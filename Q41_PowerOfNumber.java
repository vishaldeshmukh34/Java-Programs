// 41. Write a Java program to calculate the power of a number (a^n).
public class Q41_PowerOfNumber {
    public static void main(String[] args) {
        
        int a = 2;   // base number
        int n = 5;   // exponent
        int power = 1;

        for(int i = 1; i <= n; i++) {
            power = power * a;
        }

        System.out.println(a + " raised to the power " + n + " is: " + power);
    }
}
