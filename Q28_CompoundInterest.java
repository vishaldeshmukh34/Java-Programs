// 28. Write a Java program to calculate compound interest.
public class Q28_CompoundInterest {
    public static void main(String[] args) {
        
        double P = 100;  // Principal amount
        double R = 10;    // Rate of interest
        double T = 2;     // Time in years

        double amount = P * Math.pow((1 + R / 100), T);
        double compoundInterest = amount - P;

        System.out.println("Compound Interest = " + compoundInterest);
    }
}
