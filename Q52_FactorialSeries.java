// 52. Write a Java program to print the factorial series (1!, 2!, 3!, … n!).
public class Q52_FactorialSeries {
    public static void main(String[] args) {
        
            int fact = 1 ;
            for(int i = 1 ; i <= 5 ; i++ )
            {
                fact = fact * i ;
                System.out.println(fact);
            }
    }
}
