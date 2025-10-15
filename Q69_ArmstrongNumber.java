// Q69_ArmstrongNumber.java
// 69. Write a program to accept number and check whether the number is Armstrong or not. 
// (e.g. N=153 → (1)^3 + (5)^3 + (3)^3=153)

import java.util.Scanner;

public class Q69_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
