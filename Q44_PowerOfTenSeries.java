// 44. Generate the series 1, 10, 100, 1000.
public class Q44_PowerOfTenSeries {
    public static void main(String[] args) {
        
       int n = 1 ; 

       for(int  i = 1 ; i <= 4 ; i++ )
       {
         n = n * 10 ;
         System.out.println(n/10);
            
       }
       


    }
}
