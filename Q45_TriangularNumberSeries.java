// 45. Generate the series 0, 1, 3, 6, 10, 15, 21, 27, 35.
public class Q45_TriangularNumberSeries {
    public static void main(String[] args) {
        
         int n = 0 ; 
         int add = 1 ; 
    
         for(int  i = 1 ; i <= 8 ; i++ )
         {
            n = n + add ;
            add++ ;
            System.out.println(n);
                
         }
    }
}
