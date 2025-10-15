// Q70_FactorsOfNumber.java
// 70. Write a program to accept a number and print all its factors.

import java.util.Scanner;

public class Q70_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }
}
