// Q75_SumOfSquares.java
// 75. Write a program to accept a number and print the sum of squares of the first n natural numbers.

import java.util.Scanner;

public class Q75_SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("Sum of squares of first " + n + " natural numbers = " + sum);
    }
}
