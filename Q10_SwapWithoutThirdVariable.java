// 10. Write a Java program to swap two numbers without using a third variable.

public class Q10_SwapWithoutThirdVariable {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;  // Step 1
        b = a - b;  // Step 2
        a = a - b;  // Step 3

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
