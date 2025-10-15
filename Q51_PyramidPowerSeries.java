// 51. Generate the series 1, 10, 100, 1000, 100, 10, 1.
public class Q51_PyramidPowerSeries {
    public static void main(String[] args) {
        
         int n = 1 ; 
    
         for(int  i = 1 ; i <= 4 ; i++ )
         {
            n = n * 10 ;
            System.out.println(n/10);
                
         }
         for(int  i = 3 ; i >= 1 ; i-- )
         {
            n = n / 10 ;
            System.out.println(n);
                
         }
    }
}
