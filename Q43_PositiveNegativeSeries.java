// 43. Generate the series 1, -2, 3, -4, 5, -6, 7, -8, 9, -10.
public class Q43_PositiveNegativeSeries {
    public static void main(String[] args) {
        
          
         for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + "  "); // negative for even numbers
            } else {
                System.out.print(i + " ");  // positive for odd numbers
            }
        }


    }
}
