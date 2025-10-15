// 53. Write a Java program to calculate the sum of the factorial series (1! + 2! + 3! + … + n!).
public class Q53_SumOfFactorialSeries {
    public static void main(String[] args) {

            int fact = 1 ;
            int sum = 0 ;
            for(int i = 1 ; i <= 5 ; i++ )
            {
                fact = fact * i ;
                sum = sum + fact ;
                System.out.println("Factorial of " + i + " is : " + fact);
            }
            System.out.println("Sum of Factorial Series is : " + sum);
    }
}
