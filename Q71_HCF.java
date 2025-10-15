// Q71_HCF.java
// 71. Write a program to accept two numbers and find their HCF (GCD).

import java.util.Scanner;

public class Q71_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF = " + hcf);
    }
}
