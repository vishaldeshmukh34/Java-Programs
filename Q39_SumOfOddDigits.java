// 39. Write a Java program to find the sum of all odd digits from a given number.
public class Q39_SumOfOddDigits {
    public static void main(String[] args) {
        
        int sum = 0 ;
        int n = 12345 ;

        while (n > 0 ) 
        {

        int digit = n % 10 ;

        if(digit % 3 == 0)
        {
            sum += digit;
        }
            
        n = n / 10 ;
        }
    System.out.println(sum);
        
    }
}
