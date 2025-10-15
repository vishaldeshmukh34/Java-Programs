// Q72_LCM.java
// 72. Write a program to accept two numbers and find their LCM.

import java.util.Scanner;

public class Q72_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0)
                break;
            lcm++;
        }
        System.out.println("LCM = " + lcm);
    }
}
