// 49. Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21.
public class Q49_FibonacciSeries {
    public static void main(String[] args) {
        
            int n1 = 0 ;
            int n2 = 1 ;
            int n3 ;
            
            System.out.println(n1);
            System.out.println(n2);
            
            for(int i = 1 ; i <= 7 ; i++ )
            {
                n3 = n1 + n2 ;
                System.out.println(n3);
                n1 = n2 ;
                n2 = n3 ;
            }
    }
}
