// 46. Print 1 to 100 numbers that are prime numbers.
public class Q46_PrimeNumbers {
    public static void main(String[] args) {
        
         for(int num = 1 ; num <= 100 ; num++ )
         {
             int count = 0 ;
             for(int i = 1 ; i <= num ; i++ )
             {
                 if(num % i == 0)
                 {
                 count++ ;
                 }
             }
             if(count == 2)
             {
                 System.out.println(num);
             }
         }

    }
}
